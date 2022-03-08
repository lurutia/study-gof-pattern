package com.gosuljo.gof.builder;

import com.gosuljo.gof.infra.builder.after.DefaultTourPlanBuilder;
import com.gosuljo.gof.infra.builder.after.TourPlanBuilder;
import com.gosuljo.gof.infra.builder.before.TourDirector;
import com.gosuljo.gof.infra.builder.before.TourPlan;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class BuilderTests {

    // 빌더패턴 사용하지 않고 객체 만드는 테스트
    @Test
    public void builder_test_1() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");

        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오래곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));
    }

    // 빌더패턴 사용해 플랜 만드는 테스트
    @Test
    public void builder_test_2() {
        TourPlanBuilder builder = new DefaultTourPlanBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .build();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .build();
    }

    // Director 사용 객체 생성 테스트
    @Test
    public void builder_test_3() {
        TourDirector director = new TourDirector(new DefaultTourPlanBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();
    }
}
