package com.masaiqi.moocjavahighefficiencyprogram.chapter1;

/**
 * 主业务
 *
 * @author sq.ma
 * @date 2019/10/16 下午10:53
 */
public class MainService {

    /**
     * 开始主业务
     *
     * @author sq.ma
     * @date 2019/10/16 下午10:54
     */
    void doMain() {
        Integer countWorkerDo = 200;
        calculateSalary(countWorkerDo, (SalaryPredicate) -> countWorkerDo > 100);
        calculateSalary(countWorkerDo, new SalaryPredicate() {
            @Override
            public Boolean judge(Integer count) {
                return countWorkerDo > 100;
            }
        });
    }

    /**
     * 计算工人薪资
     *
     * @param countWorkerDo 工人做的件数
     * @param predicate 判断逻辑谓词 judge返回值：true-按2元一件算 false-按1元一件算
     * @return void
     * @author sq.ma
     * @date 2019/10/16 下午11:04
     */
    void calculateSalary(Integer countWorkerDo, SalaryPredicate predicate) {
        if (predicate.judge(countWorkerDo)) {
            System.err.println("工人会得到" + 2 * countWorkerDo + "元");
        } else {
            System.err.println("工人会得到" + 1 * countWorkerDo + "元");
        }
    }
}
