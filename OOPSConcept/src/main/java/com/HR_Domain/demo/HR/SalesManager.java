package com.HR_Domain.demo.HR;

import com.HR_Domain.demo.HR.Interface.IInterviewPanel;
import com.HR_Domain.demo.HR.Interface.IManagerBenefits;
import com.HR_Domain.demo.HR.Interface.ITrainer;



public class SalesManager extends SalesEmployee implements IManagerBenefits,IInterviewPanel,ITrainer{

    @Override
    public float CalculateBonus(){
        return 0;
       
    }

    @Override
    public void ApproveLeave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void TakeInterview() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Train() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
