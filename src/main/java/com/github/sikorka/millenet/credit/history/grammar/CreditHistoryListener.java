package com.github.sikorka.millenet.credit.history.grammar;

import com.github.sikorka.millenet.credit.history.CreditHistory;
import com.github.sikorka.millenet.credit.history.CreditOperation;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Getter
@Log4j
public class CreditHistoryListener extends CreditHistoryMillenetBaseListener {
    private CreditHistory creditHistory;

    private CreditOperation current;

    /**
     * @param name can be a file name or any other name
     * */
    public CreditHistoryListener(String name) {
        creditHistory = new CreditHistory(name);

        log.info("Parsing '" + name + "' ...");
    }

    @Override
    public void enterOperation(CreditHistoryMillenetParser.OperationContext ctx) {
        this.current = new CreditOperation();
    }

    @Override
    public void enterTransactionDate(CreditHistoryMillenetParser.TransactionDateContext ctx) {
        this.current.setTransactionDate(ctx.getText());
    }

    @Override
    public void enterCurrencyDate(CreditHistoryMillenetParser.CurrencyDateContext ctx) {
        this.current.setCurrencyDate(ctx.getText());
    }

    @Override
    public void enterCurrencyAmount(CreditHistoryMillenetParser.CurrencyAmountContext ctx) {
        String kwotaTransakcji = ctx.getText(); //for example: 157,34

        if (kwotaTransakcji == null) {
            kwotaTransakcji = "";
        } else {
            kwotaTransakcji = kwotaTransakcji.replace(",", ".");
        }

        this.current.setCurrencyAmount(kwotaTransakcji);
    }

    @Override
    public void enterCurrency(CreditHistoryMillenetParser.CurrencyContext ctx) {
        this.current.setCurrency(ctx.getText());
    }

    @Override
    public void enterTransactionType(CreditHistoryMillenetParser.TransactionTypeContext ctx) {
        this.current.setTransactionType(ctx.getText());
    }

    @Override
    public void enterOperationTitle(CreditHistoryMillenetParser.OperationTitleContext ctx) {
        this.current.setOperationTitle(ctx.getText());
    }

    @Override
    public void enterChf_kwota_odsetki(CreditHistoryMillenetParser.Chf_kwota_odsetkiContext ctx) {
        this.current.setChfKwotaOdsetki(ctx.getText() == null ? "" : ctx.getText());
    }

    @Override
    public void enterChf_kwota_odsetki_przeterminowane(CreditHistoryMillenetParser.Chf_kwota_odsetki_przeterminowaneContext ctx) {
        this.current.setChfKwotaOdsetkiPrzeterminowane(ctx.getText() == null ? "" : ctx.getText());
    }

    @Override
    public void enterPln_kwota(CreditHistoryMillenetParser.Pln_kwotaContext ctx) {
        String plnKwota = ctx.getText(); //for example: 1,035.96 or 974.55

        if (plnKwota == null) {
            plnKwota = "";
        } else {
            plnKwota = plnKwota.replace(",", "");
        }

        this.current.setPlnKwota(plnKwota);
    }

    @Override
    public void exitOperation(CreditHistoryMillenetParser.OperationContext ctx) {
        this.creditHistory.getOperations().add(current);
    }

    @Override
    public void exitCredit(CreditHistoryMillenetParser.CreditContext ctx) {
        log.info("🟢 Parsing done.");
    }
}
