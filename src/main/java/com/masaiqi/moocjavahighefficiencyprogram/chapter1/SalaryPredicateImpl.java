package com.masaiqi.moocjavahighefficiencyprogram.chapter1;

/**
 * @author sq.ma
 * @date 2019/10/16 下午11:22
 */
public class SalaryPredicateImpl implements SalaryPredicate{
    @Override
    public Boolean judge(Integer count) {
        if (count > 100) {
            return true;
        } else {
            return false;
        }
    }
}
