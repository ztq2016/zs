package org.clinicalresearch.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {
	public static String formatDate(Date date,String dateStyle) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateStyle);
		System.out.println(date.toString());
		String format = simpleDateFormat.format(date);
		return format;
	}
	
	private DateUtils() {
	}
	/** 日期格式 **/
    public interface DATE_PATTERN {
        String HHMMSS = "HHmmss";
        String HH_MM_SS = "HH:mm:ss";
        String YYYYMMDD = "yyyyMMdd";
        String YYYY_MM_DD = "yyyy-MM-dd";
        String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
        String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    }

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @return
	 */
	public static final String format(Object date) {
		return format(date, DATE_PATTERN.YYYY_MM_DD);
	}

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static final String format(Object date, String pattern) {
		if (date == null) {
			return null;
		}
		if (pattern == null) {
			return format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 获取日期
	 * 
	 * @return
	 */
	public static final String getDate() {
		return format(new Date());
	}

	/**
	 * 获取日期时间
	 * 
	 * @return
	 */
	public static final String getDateTime() {
		return format(new Date(), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
	}

	/**
	 * 获取日期
	 * 
	 * @param pattern
	 * @return
	 */
	public static final String getDateTime(String pattern) {
		return format(new Date(), pattern);
	}

	/**
	 * 日期计算
	 * 
	 * @param date
	 * @param field
	 * @param amount
	 * @return
	 */
	public static final Date addDate(Date date, int field, int amount) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		return calendar.getTime();
	}

	/**
	 * 字符串转换为日期:不支持yyM[M]d[d]格式
	 * 
	 * @param date
	 * @return
	 */
	public static final Date stringToDate(String date) {
		if (date == null) {
			return null;
		}
		String separator = String.valueOf(date.charAt(4));
		String pattern = "yyyyMMdd";
		if (!separator.matches("\\d*")) {
			pattern = "yyyy" + separator + "MM" + separator + "dd";
			if (date.length() < 10) {
				pattern = "yyyy" + separator + "M" + separator + "d";
			}
		} else if (date.length() < 8) {
			pattern = "yyyyMd";
		}
		pattern += " HH:mm:ss.SSS";
		pattern = pattern.substring(0, Math.min(pattern.length(), date.length()));
		try {
			return new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
	/**
	 * 字符串转换为日期:不支持yyM[M]d[d]格式
	 * 
	 * @param date
	 * @return
	 */
	public static final Date stringToDate(String date, String pattern) {
		if (date == null) {
			return null;
		}
		try {
			return new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
	/**
	 * 功能：当前时间增加秒数。
	 * @param seconds 正值时时间延后，负值时时间提前。
	 * @return Date
	 */
	public static Date getDateBeforeOrAfterSeconds(Date date,int seconds){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.SECOND, c.get(Calendar.SECOND)+seconds);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 功能：当前时间增加分钟数。
	 * @param minutes 正值时时间延后，负值时时间提前。
	 * @return Date
	 */
	public static Date getDateBeforeOrAfterMinutes(Date date,int minutes){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.MINUTE, c.get(Calendar.MINUTE)+minutes);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 功能：当前时间增加小时数。
	 * @param hours 正值时时间延后，负值时时间提前。
	 * @return Date
	 */
	public static Date getDateBeforeOrAfterHours(Date date,int hours){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR, c.get(Calendar.HOUR)+hours);
		return new Date(c.getTimeInMillis());
	}
	/**
	 * 计算出date day天之前或之后的日期
	 * @param	date	{@link Date}	日期
	 * @param	days	int				天数，正数为向后几天，负数为向前几天
	 * @return	返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterDays(Date date, int days) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + days);
		return now.getTime();
	}
	private static List<Calendar> holidayList = new ArrayList<Calendar>();  //节假日列表
	private static List<Calendar> workdayList = new ArrayList<Calendar>();  //补班日列表

	/**
	 *
	 * <p>Title: getDateAfterWorkDays </P>
	 * <p>Description: TODO  计算相加day天，并且排除节假日和周末后的日期</P>
	 * @param date  当前的日期
	 * @param day  相加天数
	 * @return
	 * return Calendar    返回类型   返回相加day天，并且排除节假日和周末后的日期
	 */
	public static  Date getDateAfterWorkDays(Date date,int day){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		try {
			for (int i = 0; i < day; i++) {
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				if(checkHoliday(calendar)){
					i--;
				}
			}
			return calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return calendar.getTime();
	}
	/**
	 *
	 * <p>Title: checkHoliday </P>
	 * <p>Description: TODO 验证日期是否是节假日</P>
	 * @param calendar  传入需要验证的日期
	 * @return
	 * return boolean    返回类型  返回true是节假日，返回false不是节假日
	 */
	public static boolean checkHoliday(Calendar calendar) throws Exception{
		//判断日期是否是周六周日
		if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
				calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
			//判断日期是否是补班日
			for (Calendar ca : workdayList) {
				if(ca.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
						ca.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)&&
						ca.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
					return false;
				}
			}
			return true;
		}
		//判断日期是否是节假日
		for (Calendar ca : holidayList) {
			if(ca.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
					ca.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)&&
					ca.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
				return true;
			}
		}
		return false;
	}
	/**
	 *
	 * <p>Title: initHolidayOrWorkList </P>
	 * <p>Description: TODO  把所有节假日、补班日放入list</P>
	 * @param date  从数据库查 查出来的格式2014-05-09
	 * @param type  1：表示节假日  2：表示补班日
	 * return void    返回类型
	 */
	public void initHolidayOrWorkList( String date,String type){
		String [] da = date.split("-");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.valueOf(da[0]));
		calendar.set(Calendar.MONTH, Integer.valueOf(da[1])-1);//月份比正常小1,0代表一月
		calendar.set(Calendar.DAY_OF_MONTH, Integer.valueOf(da[2]));
		if("1".equals(type)){
			holidayList.add(calendar);
		}else if("2".equals(type)){
			workdayList.add(calendar);
		}else{
			System.out.println("参数类型不正确！");
		}
	}
	/**
	 * 计算出date monthes月之前或之后的日期
	 * @param date 日期
	 * @param monthes 月数，正数为向后几天，负数为向前几天
	 * @return 返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterMonthes(Date date, int monthes) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.MONTH, now.get(Calendar.MONTH) + monthes);
		return now.getTime();
	}
	/**
	 * 计算出date years年之前或之后的日期
	 * @param date 日期
	 * @param years 年数，正数为向后几年，负数为向前几年
	 * @return 返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterYears(Date date, int years) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.YEAR, now.get(Calendar.YEAR) + years);
		return now.getTime();
	}
	/**
	 * 取得季度月
	 *
	 * @param date
	 * @return
	 */
	public static Date[] getSeasonDate(Date date) {
		Date[] season = new Date[3];

		Calendar c = Calendar.getInstance();
		c.setTime(date);

		int nSeason = getSeason(date);
		if (nSeason == 1) {// 第一季度
			c.set(Calendar.MONTH, Calendar.JANUARY);
			season[0] = c.getTime();
			c.set(Calendar.MONTH, Calendar.FEBRUARY);
			season[1] = c.getTime();
			c.set(Calendar.MONTH, Calendar.MARCH);
			season[2] = c.getTime();
		} else if (nSeason == 2) {// 第二季度
			c.set(Calendar.MONTH, Calendar.APRIL);
			season[0] = c.getTime();
			c.set(Calendar.MONTH, Calendar.MAY);
			season[1] = c.getTime();
			c.set(Calendar.MONTH, Calendar.JUNE);
			season[2] = c.getTime();
		} else if (nSeason == 3) {// 第三季度
			c.set(Calendar.MONTH, Calendar.JULY);
			season[0] = c.getTime();
			c.set(Calendar.MONTH, Calendar.AUGUST);
			season[1] = c.getTime();
			c.set(Calendar.MONTH, Calendar.SEPTEMBER);
			season[2] = c.getTime();
		} else if (nSeason == 4) {// 第四季度
			c.set(Calendar.MONTH, Calendar.OCTOBER);
			season[0] = c.getTime();
			c.set(Calendar.MONTH, Calendar.NOVEMBER);
			season[1] = c.getTime();
			c.set(Calendar.MONTH, Calendar.DECEMBER);
			season[2] = c.getTime();
		}
		return season;
	}
	/**
	 *
	 * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
	 *
	 * @param date
	 * @return
	 */
	public static int getSeason(Date date) {

		int season = 0;

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int month = c.get(Calendar.MONTH);
		switch (month) {
			case Calendar.JANUARY:
			case Calendar.FEBRUARY:
			case Calendar.MARCH:
				season = 1;
				break;
			case Calendar.APRIL:
			case Calendar.MAY:
			case Calendar.JUNE:
				season = 2;
				break;
			case Calendar.JULY:
			case Calendar.AUGUST:
			case Calendar.SEPTEMBER:
				season = 3;
				break;
			case Calendar.OCTOBER:
			case Calendar.NOVEMBER:
			case Calendar.DECEMBER:
				season = 4;
				break;
			default:
				break;
		}
		return season;
	}
	/**
	 * 检验是否是工作日
	 *
	 * @param dtDate
	 *            日期
	 * @return boolean
	 */
	public static boolean isWorkDate(Date dtDate) {
		long lDay = 0;
		Calendar clDate = Calendar.getInstance();
		clDate.setTime(dtDate);
		lDay = clDate.get(Calendar.DAY_OF_WEEK);
		if (lDay == Calendar.SATURDAY || lDay == Calendar.SUNDAY) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 判断是否是闰年
	 * @param year
	 * @return
     */
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ;
	}

	/**
	 * 判断是否是闰年
	 * @param date
	 * @return
     */
	public static boolean isLeapYear(Date date) {
		int y = getYear(date);
		return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ;
	}
	/**
	 * 取得日期：年
	 *
	 * @param date
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		return year;
	}

	/**
	 * 取得日期：月
	 *
	 * @param date
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int month = c.get(Calendar.MONTH);
		return month + 1;
	}

	/**
	 * 取得日期：天
	 *
	 * @param date
	 * @return
	 */
	public static int getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int da = c.get(Calendar.DAY_OF_MONTH);
		return da;
	}

	/**
	 * 获取日期：小时
	 * @param date
	 * @return
     */
	public static int getHour(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int da = c.get(Calendar.HOUR_OF_DAY);
		return da;
	}

	/**
	 * 获取日期：分钟
	 * @param date
	 * @return
     */
	public static int getMinute(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int da = c.get(Calendar.MINUTE);
		return da;
	}

	/**
	 * 获取日期：秒
	 * @param date
	 * @return
     */
	public static int getSecond(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int da = c.get(Calendar.SECOND);
		return da;
	}
	/**
	 * 获取当前前时间的，时间戳
	 *
	 * @return
	 */
	public static int getCurTimestamp() {

		return (int) (System.currentTimeMillis() / 1000L);

	}
	/**
	 * 时间戳转日期
	 *
	 * @param timestamp
	 * @param format
	 * @return
	 */

	public static String timeStamp2Date(long timestamp, String format) {

		DateFormat df = new SimpleDateFormat(format);

		String date = df.format(new java.util.Date(timestamp * 1000L));
		return date;

	}

	/**
	 * 获取系统时间
	 * @return
     */
	public static String getSystemTime(){
		int curTimestamp = getCurTimestamp();
		String s = timeStamp2Date(curTimestamp, DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
		return s;
	}
	/**
	 * 取得当天日期是周几
	 *
	 * @param date
	 * @return
	 */
	public static int getWeekDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int week_of_year = c.get(Calendar.DAY_OF_WEEK);
		return week_of_year - 1;
	}
	public static final int FIRST_DAY_OF_WEEK = Calendar.MONDAY; // 中国周一是一周的第一天
	/**
	 * 根据日期取得对应周周一日期
	 *
	 * @param date
	 * @return
	 */
	public static Date getMondayOfWeek(Date date) {
		Calendar monday = Calendar.getInstance();
		monday.setTime(date);
		monday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);
		monday.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return monday.getTime();
	}

	/**
	 * 根据日期取得对应周周日日期
	 *
	 * @param date
	 * @return
	 */
	public static Date getSundayOfWeek(Date date) {
		Calendar sunday = Calendar.getInstance();
		sunday.setTime(date);
		sunday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);
		sunday.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return sunday.getTime();
	}
	/**
	 * 取得月第一天
	 *
	 * @param date
	 * @return
	 */
	public static Date getFirstDateOfMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

	/**
	 * 取得月最后一天
	 *
	 * @param date
	 * @return
	 */
	public static Date getLastDateOfMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

	/**
	 * 取得季度第一天
	 *
	 * @param date
	 * @return
	 */
	public static Date getFirstDateOfSeason(Date date) {
		return getFirstDateOfMonth(getSeasonDate(date)[0]);
	}

	/**
	 * 取得季度最后一天
	 *
	 * @param date
	 * @return
	 */
	public static Date getLastDateOfSeason(Date date) {
		return getLastDateOfMonth(getSeasonDate(date)[2]);
	}
	/**
	 * 功能描述：返回毫秒
	 *
	 * @param date
	 *            日期
	 * @return 返回毫秒
	 */
	public static Calendar calendar = null;
	public static long getMillis(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}
	/**
	 * 得到两个时间之间的差距，根据type可返回分别以天，时，分为单位的整数
	 * @param d1
	 * @param d2
	 * @param type day\minute\hour\second
	 * @return
	 */
	public static int getBetweenDateByType(Date d1, Date d2, String type){
		long time1 = d1.getTime();
		long time2 = d2.getTime();
		long m = (time1-time2)/1000;
		int nDay = (int)m/(24*60*60);
		int nHour = (int)(m-nDay*24*60*60)/(60*60);
		int nMinute = (int)(m-nDay*24*60*60-nHour*60*60)/60;
		int mSecond = (int)(m-nDay*24*60*60-nHour*60*60);
		if("day".equals(type)){
			return nDay;
		}else if("minute".equals(type)){
			return nMinute;
		}else if("hour".equals(type)){
			return nHour;
		}else if("second".equals(type)){
			return mSecond;
		}
		return nMinute;
	}
	/**
	 * 计算两个日期之间的天数
	 * @param beginDate
	 * @param endDate
	 * @return  如果beginDate 在 endDate之后返回负数 ，反之返回正数
	 */
	public static int daysOfTwoDate(Date beginDate,Date endDate){

		Calendar beginCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();

		beginCalendar.setTime(beginDate);
		endCalendar.setTime(endDate);

		return daysOfTwoDate(beginCalendar,endCalendar);

	}

	/**
	 * 计算两个日期之间的天数
	 * @param d1
	 * @param d2
	 * @return  如果d1 在 d2 之后返回负数 ，反之返回正数
	 */
	public static int daysOfTwoDate(Calendar d1, Calendar d2) {
		int days = 0;
		int years = d1.get(Calendar.YEAR) - d2.get(Calendar.YEAR);
		if(years == 0){//同一年中
			days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
			return days;
		}else if(years > 0){//不同一年
			for(int i=0; i<years ;i++){
				d2.add(Calendar.YEAR, 1);
				days += -d2.getActualMaximum(Calendar.DAY_OF_YEAR);
				if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)){
					days += d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
					return days;
				}
			}
		}else
			for(int i=0; i<-years ;i++){
				d1.add(Calendar.YEAR, 1);
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
				if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)){
					days += d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
					return days;
				}
			}
		return days;
	}

	/**
	 * 间隔天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final Integer getDayBetween(Date startDate, Date endDate) {
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		start.set(Calendar.HOUR_OF_DAY, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		start.set(Calendar.MILLISECOND, 0);
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
		end.set(Calendar.HOUR_OF_DAY, 0);
		end.set(Calendar.MINUTE, 0);
		end.set(Calendar.SECOND, 0);
		end.set(Calendar.MILLISECOND, 0);

		long n = end.getTimeInMillis() - start.getTimeInMillis();
		return (int) (n / (60 * 60 * 24 * 1000l));
	}

	/**
	 * 间隔月
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final Integer getMonthBetween(Date startDate, Date endDate) {
		if (startDate == null || endDate == null || !startDate.before(endDate)) {
			return null;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
		int year1 = start.get(Calendar.YEAR);
		int year2 = end.get(Calendar.YEAR);
		int month1 = start.get(Calendar.MONTH);
		int month2 = end.get(Calendar.MONTH);
		int n = (year2 - year1) * 12;
		n = n + month2 - month1;
		return n;
	}

	/**
	 * 间隔月，多一天就多算一个月
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final Integer getMonthBetweenWithDay(Date startDate, Date endDate) {
		if (startDate == null || endDate == null || !startDate.before(endDate)) {
			return null;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
		int year1 = start.get(Calendar.YEAR);
		int year2 = end.get(Calendar.YEAR);
		int month1 = start.get(Calendar.MONTH);
		int month2 = end.get(Calendar.MONTH);
		int n = (year2 - year1) * 12;
		n = n + month2 - month1;
		int day1 = start.get(Calendar.DAY_OF_MONTH);
		int day2 = end.get(Calendar.DAY_OF_MONTH);
		if (day1 <= day2) {
			n++;
		}
		return n;
	}

	/**
	 * 判断一个字符串是否是日期格式
	 * @param str
	 * @return
     */
	 public static boolean isValidDate(String str) {
		   boolean convertSuccess=true;
			// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
		       SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		       try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			 format.setLenient(false);
			 format.parse(str);
			} catch (ParseException e) {
			 e.printStackTrace();
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			 convertSuccess=false;
			 }
		return convertSuccess;
	}
	/**
	 * 功能描述：格式化日期
	 *
	 * @param dateStr
	 *            String 字符型日期
	 * @param format
	 *            String 格式
	 * @return Date 日期
	 */
	public static Date str2Date(String dateStr, String format) {
		 Date date = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
			date =  dateFormat.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 功能描述：格式化输出日期
	 *
	 * @param date
	 *            Date 日期
	 * @param format
	 *            String 格式
	 * @return 返回字符型日期
	 */
	public static String date2Str(Date date, String format) {
		String result = "";
		try {
			if (date != null) {
				DateFormat dateFormat = new SimpleDateFormat(format);
				result = dateFormat.format(date);
			}
		} catch (Exception e) {
		}
		return result;
	}
	public static void main(String[] args) {

		String strDate = "2016-09-12 19:45:28";
		Date date = stringToDate(strDate);
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

			DateUtils ct = new DateUtils();
			ct.initHolidayOrWorkList("2016-09-15","1");//初始节假日
			ct.initHolidayOrWorkList("2016-09-16","1");//初始节假日
			ct.initHolidayOrWorkList("2016-09-17","1");//初始节假日
			ct.initHolidayOrWorkList("2016-09-18","2");//  初始化补班的
// 			ct.initHolidayOrWorkList("2016-10-01","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-02","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-03","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-04","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-05","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-06","1");//初始节假日
// 			ct.initHolidayOrWorkList("2016-10-07","1");//初始节假日
//			ct.initHolidayOrWorkList("2016-10-08","2");//  初始化补班的
//			ct.initHolidayOrWorkList("2016-10-09","2");//  初始化补班的
			Date c = ct.getDateAfterWorkDays(date,5);
			System.out.println(df.format(c));

		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass());
			e.printStackTrace();
		}
//		String s = date2Str(getDateBeforeOrAfterSeconds(date, 20), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s1 = date2Str(getDateBeforeOrAfterMinutes(date, 20), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s2 = date2Str(getDateBeforeOrAfterHours(date, 20), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s3 = date2Str(getDateBeforeOrAfterDays(date, 2), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s4 = date2Str(getDateBeforeOrAfterMonthes(date, -2), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s5 = date2Str(getDateBeforeOrAfterYears(date, 2), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		String s6 = date2Str(getDateBeforeOrAfterWorkDays(date, 17), DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
//		System.out.println(strDate+"--增加秒数日期："+s);
//		System.out.println(strDate+"--增加分钟日期："+s1);
//		System.out.println(strDate+"--增加小时日期："+s2);
//		System.out.println(strDate+"--增加天日期："+s3);
//		System.out.println(strDate+"--增加月日期："+s4);
//		System.out.println(strDate+"--增加年日期："+s5);
//		System.out.println(strDate+"--增加工作日日期："+s6);

//		Date date1 = str2Date(strDate, "yyyy-MM-dd");
//		String s = date2Str(date1, "yyyy-MM-dd");
//		System.out.println("日期转换字符串"+s);
//		Date date2 = new Date();
//		System.out.println("日期转字符串：" + date2Str(date2, "yyyy-MM-dd"));
//		System.out.println("字符串转日期：" + str2Date(date2Str(date2, "yyyy-MM-dd"), "yyyy-MM-dd"));
//		int timestamp = getCurTimestamp();
//		System.out.println("当前时间戳"+timestamp);
//		System.out.println("当前系统时间"+getSystemTime());
//		String s = timeStamp2Date(timestamp, "yyyy-MM-dd HH:mm:ss");
//		System.out.println("当前时间"+s);

//		System.out.println(strDate + "今天是否是工作日"+ isWorkDate(date));
//		System.out.println(strDate + "今天小时"+ getHour(date));
//		System.out.println(strDate + "今天分钟"+ getMinute(date));
//		System.out.println(strDate + "今天秒"+ getSecond(date));
//		System.out.println(strDate + "今天是否闰年"+ isLeapYear(date));
//		System.out.println("2015-2-29" + "是否日期"+ isValidDate("2015-2-29"));


//		System.out.println(strDate + " 今天是哪一年？" + getYear(date));
//		System.out.println(strDate + " 今天是哪个月？" + getMonth(date));
//		System.out.println(strDate + " 今天是几号？" + getDay(date));
//		System.out.println(strDate + " 今天是周几？" + getWeekDay(date));
//
//		System.out.println(strDate + " 所在周周一是？"
//				+ format(getMondayOfWeek(date)));
//		System.out.println(strDate + " 所在周周日是？"
//				+ format(getSundayOfWeek(date)));
//
//		System.out.println(strDate + " 当月第一天日期？"
//				+ format(getFirstDateOfMonth(date)));
//		System.out.println(strDate + " 当月最后一天日期？"
//				+ format(getLastDateOfMonth(date)));
//
//		System.out.println(strDate + " 所在季度第一天日期？"
//				+ format(getFirstDateOfSeason(date)));
//		System.out.println(strDate + " 所在季度最后一天日期？"
//				+ format(getLastDateOfSeason(date)));
//
//		System.out.println(strDate + " 是第几季度？" + getSeason(date));
//		System.out.println(strDate + " 所在季度月份？"
//				+ format(getSeasonDate(date)[0], "yyyy年MM月") + "/"
//				+ format(getSeasonDate(date)[1], "yyyy年MM月") + "/"
//				+ format(getSeasonDate(date)[2], "yyyy年MM月"));
	}
}
