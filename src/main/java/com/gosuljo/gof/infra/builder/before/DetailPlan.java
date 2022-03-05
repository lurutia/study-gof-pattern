package com.gosuljo.gof.infra.builder.before;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// 상세 계획 객체
public class DetailPlan {
    private int day;            // 날짜
    private String plan;        // 계획
}
