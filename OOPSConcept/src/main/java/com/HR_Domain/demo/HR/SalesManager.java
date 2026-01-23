package com.HR_Domain.demo.HR;

import com.HR_Domain.demo.HR.Interface.IManagerBenefits;
import com.HR_Domain.demo.HR.Interface.IInterviewPanel;
import com.HR_Domain.demo.HR.Interface.ITrainer;



public class SalesManager extends SalesEmployee implements IManagerBenefits,IInterviewPanel,ITrainer{

    public float CalculateBonus(){
        return Bonus;
    }

    
}
