package com.gosuljo.gof.infra.builder.after;

import com.gosuljo.gof.infra.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan build();
}
