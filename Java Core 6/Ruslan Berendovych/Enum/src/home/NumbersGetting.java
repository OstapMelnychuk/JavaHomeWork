package home;

public class NumbersGetting {
    private int regionNumber;
    private double randomNum;
    private int integerRandom;
    private String number = "";

    public NumbersGetting(int regionNumber) {
        this.regionNumber = regionNumber;
        try {
            initializateRandom();
        } catch (BiggerThanAllowedNumberException e) {
            System.out.println("Число [" + randomNum + "] є більше дозволеного.");
        }
    }

    //Створення рандомного 4-значного номера.
    public void initializateRandom() throws BiggerThanAllowedNumberException {

        randomNum = Math.random() * 11000;
        if(randomNum <= 9999) {
            integerRandom = (int) randomNum;
            number += integerRandom;
            if (number.length() == 3) {
                number = "0" + number;
            } else if (number.length() == 2) {
                number = "00" + number;
            } else if (number.length() == 1) {
                number = "000" + number;
            }
        }else{
            throw new BiggerThanAllowedNumberException("Число є більше ніжж дозволене.Максимально можливе число 9999");
        }
    }

    //Запис повноцінного номера.
    public void initializateNumber() {

        switch (regionNumber) {
            case 1:
                Region ac = Region.AC;
                System.out.println(ac + "" + number + "AA");
                break;
            case 2:
                Region bc = Region.BC;
                System.out.println(bc + "" + number + "AA");
                break;
            case 3:
                Region ao = Region.AO;
                System.out.println(ao + "" + number + "AA");
                break;
            case 4:
                Region bk = Region.BK;
                System.out.println(bk + "" + number + "AA");
                break;
            case 5:
                Region bo = Region.BO;
                System.out.println(bo + "" + number + "AA");
                break;
            case 6:
                Region at = Region.AT;
                System.out.println(at + "" + number + "AA");
                break;
            case 7:
                Region aa = Region.AA;
                System.out.println(aa + "" + number + "AA");
                break;
            case 8:
                Region am = Region.AM;
                System.out.println(am + "" + number + "AA");
                break;
            case 9:
                Region bx = Region.BX;
                System.out.println(bx + "" + number + "AA");
                break;
            case 10:
                Region ce = Region.CE;
                System.out.println(ce + "" + number + "AA");
                break;
            case 11:
                Region cb = Region.CB;
                System.out.println(cb + "" + number + "AA");
                break;
            case 12:
                Region ca = Region.CA;
                System.out.println(ca + "" + number + "AA");
                break;
            case 13:
                Region ab = Region.AB;
                System.out.println(ab + "" + number + "AA");
                break;
            case 14:
                Region bm = Region.BM;
                System.out.println(bm + "" + number + "AA");
                break;
            case 15:
                Region bi = Region.BI;
                System.out.println(bi + "" + number + "AA");
                break;
            case 16:
                Region ba = Region.BA;
                System.out.println(ba + "" + number + "AA");
                break;
            case 17:
                Region be = Region.BE;
                System.out.println(be + "" + number + "AA");
                break;
            case 18:
                Region bh = Region.BH;
                System.out.println(bh + "" + number + "AA");
                break;
            case 19:
                Region ax = Region.AX;
                System.out.println(ax + "" + number + "AA");
                break;
            case 20:
                Region ae = Region.AE;
                System.out.println(ae + "" + number + "AA");
                break;
            case 21:
                Region bb = Region.BB;
                System.out.println(bb + "" + number + "AA");
                break;
            case 22:
                Region ah = Region.AH;
                System.out.println(ah + "" + number + "AA");
                break;
            case 23:
                Region ap = Region.AP;
                System.out.println(ap + "" + number + "AA");
                break;
            case 24:
                Region ak = Region.AK;
                System.out.println(ak + "" + number + "AA");
                break;
            case 25:
                Region bt = Region.BT;
                System.out.println(bt + "" + number + "AA");
                break;

        }
    }
}
