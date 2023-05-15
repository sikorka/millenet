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

    public CreditHistoryListener(String fileName) {
        creditHistory = new CreditHistory(fileName);

        log.info("Processing '" + fileName + "' ...");
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
        this.current.setCurrencyAmount(ctx.getText());
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
        this.current.setPlnKwota(ctx.getText() == null ? "" : ctx.getText());
    }

    @Override
    public void exitOperation(CreditHistoryMillenetParser.OperationContext ctx) {
        this.creditHistory.getOperations().add(current);
    }

    @Override
    public void exitCredit(CreditHistoryMillenetParser.CreditContext ctx) {
        log.info("🟢 Processing done.");
    }
}
