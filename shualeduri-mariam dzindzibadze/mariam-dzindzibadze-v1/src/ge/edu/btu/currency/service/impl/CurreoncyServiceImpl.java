package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurreoncyServiceImpl implements CurrencyService {
    double exchangeRate;

    public CurreoncyServiceImpl() {
    }

    @Override
    public double convert(double amount) {
        return amount / getExchangeRate();
    }

    @Override
    public void setExchangeRate(double rate) {
        this.exchangeRate = rate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
