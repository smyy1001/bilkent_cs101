/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab08
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.ArrayList;
public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(int  year, int month, int day) {//WHEN 3 INTEGERS ARE PASSED: YEAR, MONTH, DAY
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(String Date) {//WHEN A STRING IS PASSED AS A PARAMETER: YYYY-MM-DD
        setYear( Date );
        Date = Date.substring(5, Date.length());
        setMonth( Date );
        Date = Date.substring(Date.indexOf("-") + 1 , Date.length());
        Date = Date.trim();
        setDay( Date );
    }

    Date(Date d) {//copyConstructure
       this.year = d.getYear();
       this.month = d.getMonth();
       this.day = d.getDay();

    }


    /**functionalities about the year
     * @param a
     * resulting in the final year 
     */
    public void setYear(String a) {
        this.year = Integer.parseInt(a.substring(0,4));
    }
    public int getYear() {
        return this.year;
    }


    /**funcionalities about the month
     * @param Date
     * resulting in the final month
     */
    public void setMonth(String Date) {
        if( Integer.parseInt(Date.substring(0,Date.indexOf("-"))) < 13 &&
                            Integer.parseInt(Date.substring(0,Date.indexOf("-"))) > 0 ) {
            this.month = Integer.parseInt(Date.substring(0,Date.indexOf("-")));;
        }
    }
    public int getMonth() {
        return this.month;
    }


    /**functionalities about the day 
     * @param Date
     * resulting in the final day 
     */
    public void setDay(String Date) {
        ArrayList<Integer> MonthsWith31Days = new ArrayList<Integer>();
        MonthsWith31Days.add(1);
        MonthsWith31Days.add(5);
        MonthsWith31Days.add(3);
        MonthsWith31Days.add(7);
        MonthsWith31Days.add(8);
        MonthsWith31Days.add(10);
        MonthsWith31Days.add(12);
        ArrayList<Integer> MonthsWith30Days = new ArrayList<Integer>(); 
        MonthsWith30Days.add(4);
        MonthsWith30Days.add(6);
        MonthsWith30Days.add(9);
        MonthsWith30Days.add(11);
        if(this.month == 2 ) {
            if( LeapYear(getYear()) == false) {
                if(Integer.parseInt(Date) < 29 && Integer.parseInt(Date) > 0 ) {
                    this.day = Integer.parseInt(Date);
                }
            }
            else if( LeapYear(getYear()) == true ) {
                if(Integer.parseInt(Date) < 30 && Integer.parseInt(Date) > 0 ) {
                    this.day = Integer.parseInt(Date);
                }
            }
        }
        if(MonthsWith30Days.contains(this.month)) {
            if( Integer.parseInt(Date) < 31 && Integer.parseInt(Date) > 0 ) {
                this.day = Integer.parseInt(Date);
            }
        }
        if(MonthsWith31Days.contains(this.month)) {
            if( Integer.parseInt(Date) < 32 && Integer.parseInt(Date) > 0 ) {
                this.day = Integer.parseInt(Date);
            }
        }
    }
    public int getDay() {
        return this.day;
    }


    /**
     * @param year
     * @return true if the year is a leap year. false if not 
     */
    public boolean LeapYear(int year) {
        boolean leap = false;
        if(year % 4 == 0 && year % 100 != 0) {
            leap = true;
        }
        if(year % 100 == 0 && year % 400 == 0) {
            leap = true;
        }
        return leap;
    }

    /**
     * converting all of the information to one paragraph(String)
     */
    public String toString() {
        String output;
        output = this.year + "-" + this.month + "-" + this.day;
        return output;
    }

    /**
     * calculate the number of days between Date's
     * @param x
     * @return the days between two Date's
     */
    public int daysBetween(Date x) {
        int yearsBetween = Math.abs(this.year - x.getYear());
        int monthsBetween = Math.abs(this.month - x.getMonth());
        int daysBetween = Math.abs(this.day - x.getDay());
        int totalDaysBetween = (yearsBetween * 365) + monthsBetween * 30 + daysBetween;
        return totalDaysBetween;
    }

    /**
     * calculate the new Date after one Date is the given number of days in the past 
     * @param a
     * @return the new Date 
     */
    public String addDays(int a) {
        int yearr = year;
        int monthh = month;
        int dayy = day;
        ArrayList<Integer> MonthsWith31Days = new ArrayList<Integer>();
        MonthsWith31Days.add(1);
        MonthsWith31Days.add(5);
        MonthsWith31Days.add(3);
        MonthsWith31Days.add(7);
        MonthsWith31Days.add(8);
        MonthsWith31Days.add(10);
        MonthsWith31Days.add(12);
        ArrayList<Integer> MonthsWith30Days = new ArrayList<Integer>(); 
        MonthsWith30Days.add(4);
        MonthsWith30Days.add(6);
        MonthsWith30Days.add(9);
        MonthsWith30Days.add(11);
        //set the year 
        int addYear = a / 365;
        a -= (addYear * 365);
        yearr += addYear;
        //set the month
        int addMonth = a / 30;
        a = a % 30;
        while(addMonth > 0 && monthh < 12) {
            monthh++;
            addMonth--;
        }
        if(addMonth > 0 && addMonth < 13) {
            monthh = addMonth;
            yearr++;
        }
        else if( addMonth > 12) {
            monthh = (addMonth % 12);
            yearr += addMonth / 12;
        }
        //set the day
        if(LeapYear(yearr)) {
            if(monthh == 2) {
                while(dayy < 30 && a > 0) {
                    dayy++;
                    a--;
                }
            }
        }
        else if(!LeapYear(yearr)) {
            if(monthh == 2) {
                while(dayy < 29 && a > 0) {
                    dayy++;
                    a--;
                }
            }
        }
        if(MonthsWith30Days.contains(monthh)) {
            while(dayy < 31 && a > 0) {
                dayy++;
                a--;
            }
        }
        if(MonthsWith31Days.contains(monthh)) {
            while(dayy < 32 && a > 0 ) {
                dayy++;
                a--;
            }
        }
        String datee = yearr + "-" + monthh + "-" + dayy;
        return datee; 
    }

    /**
     * dedect wether the the passed Date is before or after the start Date 
     * @param a
     * @return true if the passed Date is before the start Date, false if not 
     */
    public boolean isBefore(Date a) {
        boolean isBefore = true;
        if(this.year > a.getDay()) {
            isBefore = false;
        }
        else if(this.year == a.getDay()) {
            if(this.month > a.getMonth()) {
                isBefore = false;
            }
        }
        else if(this.year == a.getYear()) {
            if(this.month == a.getMonth()) {
                if(this.day > a.getDay()) {
                    isBefore = false;
                }
            }
        }
        return isBefore;
    }
    
    public int initDaysInMonth(int monthNumber) {
        int dayss = 0;
        ArrayList<Integer> MonthsWith31Days = new ArrayList<Integer>();
        MonthsWith31Days.add(1);
        MonthsWith31Days.add(5);
        MonthsWith31Days.add(3);
        MonthsWith31Days.add(7);
        MonthsWith31Days.add(8);
        MonthsWith31Days.add(10);
        MonthsWith31Days.add(12);
        ArrayList<Integer> MonthsWith30Days = new ArrayList<Integer>(); 
        MonthsWith30Days.add(4);
        MonthsWith30Days.add(6);
        MonthsWith30Days.add(9);
        MonthsWith30Days.add(11);
        if( MonthsWith31Days.contains(monthNumber) ) {
            dayss = 31;
        }
        else if( MonthsWith30Days.contains(monthNumber)) {
            dayss = 30;
        }
        else if(monthNumber == 2) {
            if(LeapYear(this.year)) {
                dayss = 29;
            }
            else if(!LeapYear(this.year)) {
                dayss = 28;
            }
        }
        return dayss;
    }
}
