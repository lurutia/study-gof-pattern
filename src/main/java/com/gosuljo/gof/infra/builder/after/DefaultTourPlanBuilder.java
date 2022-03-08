package com.gosuljo.gof.infra.builder.after;

import com.gosuljo.gof.infra.builder.before.DetailPlan;
import com.gosuljo.gof.infra.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourPlanBuilder implements TourPlanBuilder {
    private String title;               // 여행 이름
    private int nights;                 // 몇박
    private int days;                   // 며칠
    private LocalDate startDate;        // 시작일
    private String whereToStay;         // 어디서 머무르는지
    private List<DetailPlan> plans;     // 디테일한 계획

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan build() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
