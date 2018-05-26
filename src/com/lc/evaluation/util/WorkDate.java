package com.lc.evaluation.util;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;


public class WorkDate {
	
	public static final int TODAY_OFF_SET = 0;
	public static final int TOMORROW_OFF_SET = 1;
	public static final int BEFORE_7_DAYS__OFF_SET = -6;
	
	public static Date getTodayDate(){
		return getDateFlexible(TODAY_OFF_SET);
	}
	
	public static Date getTomorrowDate(){
		return getDateFlexible(TOMORROW_OFF_SET);
	}
	/**
	 * 从当天开始
	 * @return
	 */
	public static Date getBefore7DayDate(){
		return getDateFlexible(BEFORE_7_DAYS__OFF_SET);
	}

	/**
	 * 以现在时间为基础，返回以后的日期或者以前的日期，以后的offSet为正值，以前的为扶植
	 * @param offSet 日期相差天数
	 * @return 返回那天的日期
	 */
	public static Date getDateFlexible(int offSet){
		LocalDate localDate = new LocalDate();
		return localDate.plusDays(offSet).toDate();
	}

	/**
	 * 得到date之后的下一天日期
	 * @param date
	 * @return
	 */
	public static Date getNextDate(Date date){
		if(date == null)
			return getTodayDate();
		LocalDate localDate = new LocalDate(date);
		return localDate.plusDays(TOMORROW_OFF_SET).toDate();
	}
	
	/**
	 * 得到该年初的日期
	 * @param date 参考日期
	 * @return 返回该年初的日期
	 */
	public static Date getBeginOfYeatDate(Date date){
		LocalDate localDate = new LocalDate(date);
		int year = localDate.getYear();
		return new LocalDate(year, 1, 1).toDate();
	}
	
	/**
	 * 返回该月月初的日期
	 * @param date 参考日期
	 * @return 返回该月月初的日期
	 * 
	 */
	public static Date getBeginOfMonthDate(Date date){
		LocalDate localDate = new LocalDate(date);
		int year = localDate.getYear();
		int month = localDate.getMonthOfYear();
		return getBeginOfMonthDate(year, month);
	}
	
	/**
	 * 本月的月初的日期
	 * @return
	 */
	public static Date getBeginOfThisMonthDate(){
		return getBeginOfMonthDate(new Date());
	}
	/**
	 * 本年年初的日期
	 * @return
	 */
	public static Date getBeginOfThisYearDate(){
		return getBeginOfYeatDate(new Date());
	}
	
	/**
	 * 返回该月月初的日期
	 * @param year 年份
	 * @param month 月份
	 * @return 返回该月月初的日期
	 */
	public static Date getBeginOfMonthDate(int year ,int month){
		LocalDate localDate = new LocalDate(year, month, 1);
		return localDate.toDate();
	}
	
	/**
	 * 默认模式 yyyyMMddHHmmss
	 * @return
	 */
	public static String getNowDateTime(){
		return getNowDateTime("yyyyMMddHHmmss");
	}
	
	/**
	 * yyyy-MM-dd HH:mm
	 * @param date
	 * @return
	 */
	public static String dateTimeToString(Date date){
		return getDateTime(date, "yyyy-MM-dd HH:mm");
	}
	/**
	 * yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date){
		return getDateTime(date, "yyyy-MM-dd");
	}
	
	/**
	 * 固定模式产生当前时间的字符串
	 * @param pattern
	 * @return
	 */
	public static String getNowDateTime(String pattern){
		DateTime dateTime = new DateTime();
		String date = dateTime.toString(pattern);
		return date;
	}
	
	/**
	 * 返回下一个小时 ,时间样式格式为 HH
	 * @param date
	 * @return
	 */
	public static String getCeilHourTime(Date date){
		LocalTime lt = new LocalTime(date);
		int hour = lt.getHourOfDay();
		DateTime ltn = new DateTime(2000, 2, 2, hour + 1, 0,0);
		
		return getDateTime(ltn.toDate(), "HH");
	}
	
	/**
	 * 根据格式得到时间字符串
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String getDateTime(Date date, String pattern){
		DateTime lt = new DateTime(date);
		return lt.toString(pattern);
	}
	
	/**
	 * HH:mm
	 * @param date
	 * @return
	 */
	public static String getTime(Date date){
		return getDateTime(date, "HH:mm");
	}
	
	/**
	 * 得到当前日期所对应当月的天数
	 * @param date
	 * @return
	 */
	public static String getDayOfMonth(Date date){
		return getDateTime(date, "dd");
	}
	
	
	/**
	 * 在date时间的基础上添加时间
	 * @param date
	 * @param hours
	 * @param minutes
	 * @param seconds
	 * @return
	 */
	public static Date addTime(Date date, int hours, int minutes, int seconds){
		DateTime dt = new DateTime(date);
		int h = dt.getHourOfDay() + hours;
		int m = dt.getMinuteOfHour() + minutes;
		int s = dt.getSecondOfMinute() + seconds;
		LocalTime lt = new LocalTime(h, m, s);
		return lt.toDateTimeToday().toDate();
	}
	

	public static Date toDate(String dateStr){
		DateTime dt = new DateTime(dateStr);
		return dt.toDate();
	}
}
