package com.masaiqi.moocjavahighefficiencyprogram.chapter1;

/**
 * 薪资计算谓词
 *
 * @author sq.ma
 * @date 2019/10/16 下午11:14
 */
@FunctionalInterface
public interface SalaryPredicate {

    Boolean judge(Integer count);

}
