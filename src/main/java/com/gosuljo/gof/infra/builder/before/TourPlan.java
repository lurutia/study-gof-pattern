package com.gosuljo.gof.infra.builder.before;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
// 여행상품 객체
public class TourPlan {
    private String title;               // 여행 이름
    private int nights;                 // 몇박
    private int days;                   // 며칠
    private LocalDate startDate;        // 시작일
    private String whereToStay;         // 어디서 머무르는지
    private List<DetailPlan> plans;     // 디테일한 계획

    public void addPlan(int day, String plan) {
        if (plans == null) {
            plans = new ArrayList<>();
        }
        this.plans.add(new DetailPlan(day, plan));
    }
}
