package mytest;

import com.kuang.demo1.CustomerDao;
import com.kuang.jdk.MyBeanFactory;

public class testing {
    public static void main(String[] args){
        CustomerDao customerdao= MyBeanFactory.getBean();
        customerdao.add();
        customerdao.update();
        customerdao.delete();
        customerdao.find();
    }
}
