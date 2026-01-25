package com.HR_Domain.demo.HR;
import com.HR_Domain.demo.HR.Interface.IAppraisable;

public class SalesEmployee extends Employee implements IAppraisable {

    @Override
    public void ConductAppraisal() {
         System.out.println("Sales Employee appraisal completed.");
    }
}
