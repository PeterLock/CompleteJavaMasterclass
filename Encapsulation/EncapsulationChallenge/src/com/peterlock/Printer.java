package com.peterlock;

/**
 * Created by macbookpro on 6/26/2017 AD.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if(tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        if(tonerAmount >0 && tonerAmount <= 100){
            if(this.tonerLevel+tonerAmount >100){
                return -1;
            }
            this.tonerLevel+= tonerAmount;
            return this.tonerLevel;
        } else{
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int printPage(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint/=2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    private boolean reduceTonerLevel(int tonerUsed) {
        if(this.tonerLevel - tonerUsed <0 ){
            System.out.println("Toner needs to be replace. . .");
        } else{
            this.tonerLevel-= tonerUsed;
            return true;
        }
        return false;
    }
}
