package com.codymichaelbarker.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodyO on 4/14/2018.
 */

public class BankAccountList{
    private static  BankAccountList INSTANCE = null;

    private List<BankAccount> bankAccountList;

    private BankAccountList()
    {
        bankAccountList = new ArrayList<BankAccount>();
        bankAccountList.add(new BankAccount("Saving", 1000.00));
        bankAccountList.add(new BankAccount("Checking", 50.00));
    }


    static BankAccountList getInstance() {
        if (INSTANCE == null) {
            synchronized(BankAccount.class)
            {
                INSTANCE = new BankAccountList();
            }
        }
        return INSTANCE;
    }


    public List<BankAccount> getInternalList()
    {
        return bankAccountList;
    }


    public BankAccount getAccountByName(String acct)
    {
        for(int a = 0; a < bankAccountList.size(); a++)
        {
            if (bankAccountList.get(a).getName() == acct)
            {
                return bankAccountList.get(a);
            }
        }

        return null;
    }


    public void addAccount(BankAccount newBankAcc)
    {
        bankAccountList.add(newBankAcc);
    }
}


