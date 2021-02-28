package org.crud.core.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * 日付関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class DateUtil {

    /**
     * 日付文字列を日付に変換します。
     *
     * @param date   日付文字列
     * @param format 書式
     * @return 日付
     */
    public static LocalDate parse(String date, String format) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format));
    }

    /**
     * 日付文字列を日付に変換します。
     *
     * @param date   日付文字列
     * @param format 書式
     * @return 日付
     */
    public static LocalDateTime parseTime(String date, String format) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(format));
    }

    /**
     * 日付文字列を日付に変換します。
     *
     * @param date   日付文字列
     * @param format 書式
     * @return 日付
     */
    public static Timestamp parseStamp(String date, String format) {
        try {
            return new Timestamp(parse(date, format).toEpochDay());
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 年月日数値を日付に変換します。
     *
     * @param yyyy 年
     * @param mm   月
     * @param dd   日
     * @return 日付
     */
    public static LocalDate parseDate(int yyyy, int mm, int dd) {
        LocalDate date = getToday();
        date = date.withYear(yyyy).withMonth(mm).withDayOfMonth(dd);
        return date;
    }

    /**
     * 時刻数値を日付に変換します。
     *
     * @param hh 時間
     * @param mm 分
     * @param ss 秒
     * @return 日付
     */
    public static LocalDate parseTime(int hh, int mm, int ss) {
        LocalDate date = getToday();
        date = date.atTime(hh, mm, ss).toLocalDate();
        return date;
    }

    /**
     * 年月日時刻数値を日付に変換します。
     *
     * @param yyyy 年
     * @param mi   月
     * @param dd   日
     * @param hh   時間
     * @param mm   分
     * @param ss   秒
     * @return 日付
     */
    public static LocalDate parseDateTime(int yyyy, int mi, int dd, int hh, int mm, int ss) {
        LocalDate date = getToday();
        date = date.withYear(yyyy).withMonth(mi).withDayOfMonth(dd).atTime(hh, mm, ss).toLocalDate();
        return date;
    }

    /**
     * 日付をカレンダーに変換します。
     *
     * @param date 日付
     * @return カレンダー
     */
    public static Calendar toCalendar(LocalDate date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.toEpochDay());
        return calendar;
    }

    /**
     * 現在日付を取得します。
     *
     * @return 現在日付
     */
    public static LocalDate getToday() {
        return LocalDate.now();
    }

    /**
     * 現在日付を取得します。
     *
     * @return 現在日付
     */
    public static LocalDateTime getTodayTime() {
        return LocalDateTime.of(getToday(), LocalTime.MIDNIGHT);
    }

    /**
     * 昨日日付を取得します。
     *
     * @return 昨日日付
     */
    public static LocalDate getYesterday() {
        return addDays(getTodayString(), -1);
    }

    /**
     * 明日日付を取得します。
     *
     * @return 明日日付
     */
    public static LocalDate getTomorrow() {
        return addDays(getTodayString(), 1);
    }

    /**
     * システム日時を取得します.
     *
     * @return システム日時
     */
    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    /**
     * システム日を取得します.
     *
     * @return システム日
     */
    public static LocalDate getLocalDate() {
        return LocalDate.now();
    }

    /**
     * 現在日付文字列を取得します。
     *
     * @param format 書式
     * @return 現在日付文字列
     */
    public static String getTodayString(String format) {
        return dateToString(getToday(), format);
    }

    /**
     * 現在日付文字列を取得します。
     *
     * @return 現在日付文字列
     */
    public static String getTodayString() {
        return getTodayString("yyyy/MM/dd");
    }

    /**
     * 日付を文字列に変換します。
     *
     * @param date   日付
     * @param format 書式
     * @return 文字列
     */
    public static String dateToString(LocalDate date, String format) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(format);
        return formater.format(date);
    }

    /**
     * 日付を文字列に変換します。
     *
     * @param date   日付
     * @param format 書式
     * @return 文字列
     */
    public static String dateToString(LocalDateTime date, String format) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(format);
        return formater.format(date);
    }

    /**
     * 日付を文字列に変換します。
     *
     * @param date   日付
     * @param format 書式
     * @return 文字列
     */
    public static String dateToString(long date, String format) {
        return dateToString(getToday(), format);
    }

    /**
     * 現在日時を指定書式で文字列に変換します。
     *
     * @param format 書式
     * @return 文字列
     */
    public static String currentDateToString(String format) {
        return dateToString(getToday(), format);
    }

    /**
     * 年月日時の文字列を日付に変換します。
     *
     * @param yyyy 年
     * @param mm   月
     * @param dd   日
     * @param hh   時
     * @return 日付
     */
    public static LocalDate stringToDate(String yyyy, String mm, String dd, String hh) {
        LocalDate date = getToday();
        date = date.withYear(Integer.parseInt(yyyy)).withMonth(Integer.parseInt(mm) - 1)
                .withDayOfMonth(Integer.parseInt(dd)).atTime(Integer.parseInt(hh), 0).toLocalDate();
        return date;
    }

    /**
     * 日付かを確認します。
     *
     * @param date 日付
     * @return 不正な日付の場合 false を返します
     */
    public static boolean isDate(String date) {
        if (StringUtils.isEmpty(date)) {
            throw new NullPointerException("引数は Null もしくは空文字です。");
        }
        date = date.replace('-', '/');
        DateFormat format = DateFormat.getDateInstance();
        // 日付/時刻解析を厳密に行うかどうかを設定する。
        format.setLenient(false);
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 対象日の最終日時（23時59分59秒）を取得します。
     *
     * @param date 対象日
     * @return 対象日の最終日時
     */
    public static LocalDate getDayLastTime(String date) {
        return getDayLastTime(parse(date, "yyyy/MM/dd"));
    }

    /**
     * 対象日の最終日時（23時59分59秒）を取得します。
     *
     * @param date 対象日
     * @return 対象日の最終日時
     */
    public static LocalDate getDayLastTime(LocalDate date) {
        LocalDateTime time = date.atTime(23, 59, 59);
        return time.toLocalDate();
    }

    /**
     * 対象日の最終日時（23時59分59秒）を取得します。
     *
     * @param stamp 対象日
     * @return 対象日の最終日時
     */
    public static Timestamp getDayLastTimestamp(Timestamp stamp) {
        LocalDate day = LocalDate.ofEpochDay(stamp.getTime());
        day = getDayLastTime(day);
        return new Timestamp(day.toEpochDay());
    }

    /**
     * 本日日時（0時0分0秒）を取得します。
     *
     * @return 対象日の最終日時
     */
    public static Timestamp getTodayTimestamp() {
        return zeroStamp(Timestamp.valueOf(getLocalDateTime()));
    }

    /**
     * 時間をゼロにした日時を取得します。
     *
     * @param stamp 対象日時
     * @return 時間をゼロにした日時
     */
    public static Timestamp zeroStamp(Timestamp stamp) {
        LocalDate day = LocalDate.ofEpochDay(stamp.getTime());
        LocalDateTime time = day.atTime(0, 0, 0, 0);
        return new Timestamp(time.toLocalDate().toEpochDay());
    }

    /**
     * 対象日の翌月を取得します。
     *
     * @param date 対象日
     * @return 対象日の翌月
     */
    public static LocalDate getNextMonth(String date) {
        return addDate(date, Calendar.MONTH, 1);
    }

    /**
     * 対象日の先月を取得します。
     *
     * @param date 対象日
     * @return 対象日の翌月
     */
    public static LocalDate getPrevMonth(LocalDate date) {
        return addDate(date, Calendar.MONTH, -1);
    }

    /**
     * 対象日の翌日を取得します。
     *
     * @param date 対象日
     * @return 対象日の翌日
     */
    public static LocalDate getNextDay(String date) {
        return addDays(date, 1);
    }

    /**
     * 対象日の翌日を取得します。
     *
     * @param date 対象日
     * @return 対象日の翌日
     */
    public static LocalDate getNextDay(LocalDate date) {
        return addDate(date, Calendar.DATE, 1);
    }

    /**
     * 対象日の前日を取得します。
     *
     * @param date 対象日
     * @return 対象日の前日
     */
    public static LocalDate getPreviousDay(String date) {
        return addDays(date, -1);
    }

    /**
     * 対象日の前日を取得します。
     *
     * @param date 対象日
     * @return 対象日の前日
     */
    public static LocalDate getPreviousDay(LocalDate date) {
        return addDate(date, Calendar.DATE, -1);
    }

    /**
     * 日付を加算／減算します。
     *
     * @param date   日付
     * @param amount 加算／減算する値
     * @return 加算／減算された日付
     */
    public static LocalDate addDays(String date, int amount) {
        return addDate(date, Calendar.DATE, amount);
    }

    /**
     * 日付を加算／減算します。
     *
     * @param date          日付文字列
     * @param calendarField 日付フィールド値
     * @param amount        加算／減算する値
     * @return 加算／減算された日付
     */
    public static LocalDate addDate(String date, int calendarField, int amount) {
        return addDate(parse(date, "yyyy/MM/dd"), calendarField, amount);
    }

    /**
     * 日付を加算／減算します。
     *
     * @param date          日付
     * @param calendarField 日付フィールド値
     * @param amount        加算／減算する値
     * @return 加算／減算された日付
     */
    public static LocalDate addDate(LocalDate date, int calendarField, int amount) {
        switch (calendarField) {
            case Calendar.YEAR:
                date = date.plusYears(amount);
                break;
            case Calendar.MONTH:
                date = date.plusMonths(amount);
                break;
            case Calendar.DATE:
                date = date.plusDays(amount);
                break;
        }
        return date;
    }

    /**
     * 日付を加算／減算した日付文字列を取得します。
     *
     * @param date          日付文字列
     * @param calendarField 日付フィールド値
     * @param amount        加算／減算する値
     * @param format        書式
     * @return 加算／減算された日付
     */
    public static String addDateToString(String date, int calendarField, int amount, String format) {
        return dateToString(addDate(date, calendarField, amount), format);
    }

    /**
     * 対象日時に分を加算したタイムスタンプを取得します。
     *
     * @param date   対象日時
     * @param amount 加算する分
     * @return タイムスタンプ
     */
    public static Timestamp addMinuteStamp(LocalDate date, int amount) {
        LocalDate result = date.with(ChronoField.MINUTE_OF_HOUR, amount);
        return new Timestamp(result.toEpochDay());
    }

    /**
     * 対象日時に秒を加算したタイムスタンプを取得します。
     *
     * @param date   対象日時
     * @param amount 加算する秒
     * @return タイムスタンプ
     */
    public static Timestamp addSecondStamp(LocalDate date, int amount) {
        LocalDate result = date.with(ChronoField.SECOND_OF_MINUTE, amount);
        return new Timestamp(result.toEpochDay());
    }

    /**
     * 対象日までの残り日時文字列を取得します。
     *
     * @param date 対象日
     * @return 残り日時文字列
     */
    public static String getRemain(LocalDate date) {
        long nowTime = Calendar.getInstance().getTimeInMillis();
        long endTime = date.toEpochDay();

        long diff = endTime - nowTime;
        // diff = diff / 60 / 24;

        if (diff < 0) {
            return "終了";
        }

        long dayDiff = Math.abs(getRemainValue(date));

        if (dayDiff > 0) {
            return dayDiff + "日";
        }

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        String[] hms = StringUtils.split(formatter.format(new Date(diff)), ":");
        String[] unit = {"時間", "分", "秒"};

        String result = null;

        for (int i = 0; i < hms.length; i++) {
            if (!"00".equals(hms[i])) {
                result = String.valueOf(Integer.parseInt(hms[i])) + unit[i];
                break;
            }
        }

        return result;
    }

    /**
     * 対象日と本日の差を返します。
     *
     * @param date 対象日
     * @return 対象日と本日の差（前日は0より大きい、後日はマイナス）
     */
    public static int getRemainValue(LocalDate date) {
        long now = getToday().toEpochDay();
        long target = date.toEpochDay();
        long one_date_time = 1000 * 60 * 60 * 24;
        long diffDays = (now - target) / one_date_time;
        return (int) diffDays;
    }

    /**
     * ２つの日付の差を返します。
     *
     * @param date1 対象日
     * @param date2 対象日
     * @return 差の日数
     */
    public static int differenceDays(LocalDate date1, LocalDate date2) {
        long datetime1 = date1.toEpochDay();
        long datetime2 = date2.toEpochDay();
        long one_date_time = 1000 * 60 * 60 * 24;
        long diffDays = (datetime1 - datetime2) / one_date_time;
        return (int) diffDays;
    }

    /**
     * 対象時刻と現在時刻の差が、指定分前であるか確認します。
     *
     * @param date 対象時刻
     * @return 指定分前であれば true を返します
     */
    public static boolean isRemainMinute(LocalDate date, int minute) {
        long now = Calendar.getInstance().getTimeInMillis();
        long target = date.toEpochDay();
        long diff = target - now;
        int remain = Long.valueOf(diff / 1000).intValue();
        int sec = minute * 60;
        return ((remain > 0) && (remain < sec));
    }

    /**
     * 対象日が過去日であるか確認します。
     *
     * @param date 対象日
     * @return 過去日の場合 true を返します。
     */
    public static boolean isPastDay(String date) {
        return isPastDay(parse(date, "yyyy/MM/dd"));
    }

    /**
     * 対象日が過去日であるか確認します。
     *
     * @param date 対象日
     * @return 過去日の場合 true を返します。
     */
    public static boolean isPastDay(LocalDate date) {
        long past = DateUtils.truncate(date, Calendar.DATE).getTime();
        long current = getToday().toEpochDay();
        return past < current;
    }

    /**
     * 過去日時であるか確認します。
     *
     * @param yyyy 年
     * @param mm   月
     * @param dd   日
     * @param hh   時
     * @return 過去日時の場合 true を返します。
     */
    public static boolean isPastDateTime(String yyyy, String mm, String dd, String hh) {
        return isPastDateTime(stringToDate(yyyy, mm, dd, hh));
    }

    /**
     * 過去日時であるか確認します。
     *
     * @return 過去日時の場合 true を返します。
     */
    public static boolean isPastDateTime(LocalDate date) {
        long past = DateUtils.truncate(date, Calendar.HOUR).getTime();
        long current = DateUtils.truncate(getLocalDateTime(), Calendar.HOUR).getTime();
        return past < current;
    }

    /**
     * 未来日付であるか確認します。
     *
     * @param date 日付文字列
     * @return 未来日付の場合 true を返します
     */
    public static boolean isFutureDay(String date) {
        return isFutureDay(parse(date, "yyyy/MM/dd"));
    }

    /**
     * 未来日付であるか確認します。
     *
     * @param date 日付
     * @return 未来日付の場合 true を返します
     */
    public static boolean isFutureDay(LocalDate date) {
        long future = DateUtils.truncate(date, Calendar.DATE).getTime();
        long current = getToday().toEpochDay();
        return future > current;
    }

    /**
     * 現在日時であるか確認します。
     *
     * @param yyyy 年
     * @param mm   月
     * @param dd   日
     * @param hh   時
     * @return 現在日時の場合 true を返します。
     */
    public static boolean isCurrentDateTime(String yyyy, String mm, String dd, String hh) {
        return isCurrentDateTime(stringToDate(yyyy, mm, dd, hh));
    }

    /**
     * 現在日時であるか確認します。
     *
     * @return 現在日時の場合 true を返します。
     */
    public static boolean isCurrentDateTime(LocalDate date) {
        long now = DateUtils.truncate(date, Calendar.HOUR).getTime();
        long current = DateUtils.truncate(getLocalDateTime(), Calendar.HOUR).getTime();
        return now == current;
    }

    /**
     * 日付を比較します。
     *
     * @param from 開始日
     * @param to   終了日
     * @return from > to の場合 false を返します
     */
    public static boolean isComparisonDate(String from, String to) {
        return isComparisonDate(parse(from, "yyyy/MM/dd"), parse(to, "yyyy/MM/dd"));
    }

    /**
     * 日付を比較します。
     *
     * @param from 開始日
     * @param to   終了日
     * @return from > to の場合 false を返します
     */
    public static boolean isComparisonDate(LocalDate from, LocalDate to) {
        long fromTime = from.toEpochDay();
        long toTime = to.toEpochDay();
        return fromTime <= toTime;
    }

    /**
     * 時間リストを取得します。
     *
     * @return 時間リスト
     */
    public static List<String> getTimeList() {
        List<String> result = CollectionUtil.newArrayList();
        DecimalFormat formatter = new DecimalFormat("00");
        for (int i = 0; i < 24; i++) {
            result.add(formatter.format(i));
        }
        return result;
    }

    /**
     * 日付から年文字列を取得します。
     *
     * @param date 日付
     * @return 年文字列
     */
    public static String getYear(LocalDate date) {
        return getDate(date, Calendar.YEAR);
    }

    /**
     * 日付から月文字列を取得します。
     *
     * @param date 日付
     * @return 月文字列
     */
    public static String getMonth(LocalDate date) {
        return getDate(date, Calendar.MONTH);
    }

    /**
     * 日付から日文字列を取得します。
     *
     * @param date 日付
     * @return 日文字列
     */
    public static String getDay(LocalDate date) {
        return getDate(date, Calendar.DATE);
    }

    /**
     * 日付から時文字列を取得します。
     *
     * @param date 日付
     * @return 時文字列
     */
    public static String getHour(LocalDate date) {
        return getDate(date, Calendar.HOUR_OF_DAY);
    }

    /**
     * 日付から分文字列を取得します。
     *
     * @param date 日付
     * @return 分文字列
     */
    public static String getMinute(LocalDate date) {
        return getDate(date, Calendar.MINUTE);
    }

    /**
     * 日付から秒文字列を取得します。
     *
     * @param date 日付
     * @return 秒文字列
     */
    public static String getSecond(LocalDate date) {
        return getDate(date, Calendar.SECOND);
    }

    /**
     * 日付から年数値を取得します。
     *
     * @param date 日付
     * @return 年数値
     */
    public static int getYearValue(LocalDate date) {
        return NumberUtils.toInt(getYear(date));
    }

    /**
     * 日付から月数値を取得します。
     *
     * @param date 日付
     * @return 月数値
     */
    public static int getMonthValue(LocalDate date) {
        return NumberUtils.toInt(getMonth(date));
    }

    /**
     * 日付から日数値を取得します。
     *
     * @param date 日付
     * @return 日数値
     */
    public static int getDayValue(LocalDate date) {
        return NumberUtils.toInt(getDay(date));
    }

    /**
     * 日付から時数値を取得します。
     *
     * @param date 日付
     * @return 時数値
     */
    public static int getHourValue(LocalDate date) {
        return NumberUtils.toInt(getHour(date));
    }

    /**
     * 日付から分数値を取得します。
     *
     * @param date 日付
     * @return 分数値
     */
    public static int getMinuteValue(LocalDate date) {
        return NumberUtils.toInt(getMinute(date));
    }

    /**
     * 日付から秒数値を取得します。
     *
     * @param date 日付
     * @return 秒数値
     */
    public static int getSecondValue(LocalDate date) {
        return NumberUtils.toInt(getSecond(date));
    }

    /**
     * 日付から対象フィールドの文字列を取得します。
     *
     * @param date          日付
     * @param calendarField カレンダーフィールド
     * @return 指定フィールド文字列
     */
    public static String getDate(LocalDate date, int calendarField) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date.toEpochDay());
        DecimalFormat formatter = null;
        if (Calendar.YEAR == calendarField) {
            formatter = new DecimalFormat("0000");
        } else {
            formatter = new DecimalFormat("00");
        }
        if (Calendar.MONTH == calendarField) {
            return formatter.format(cal.get(calendarField));
        }
        return formatter.format(cal.get(calendarField));
    }

    /**
     * 当月の月初を取得します。
     *
     * @return 当月の月初
     */
    public static LocalDate getThisMonthFirstDay() {
        LocalDate today = getToday();
        return today.withDayOfMonth(1);
    }

    /**
     * 翌月の月初を取得します。
     *
     * @return 翌月の月初
     */
    public static LocalDate getNextMonthFirstDay() {
        LocalDate nextMonth = getToday().plusMonths(1);
        return nextMonth.atStartOfDay().toLocalDate();
    }

    /**
     * 対象日付が範囲内か確認します。
     *
     * @param from   範囲の下限
     * @param to     範囲の上限
     * @param target 対象日付
     * @return 範囲内の場合 true を返します
     */
    public static boolean isDateRange(LocalDate from, LocalDate to, LocalDate target) {
        long targetValue = target.toEpochDay();
        long fromValue = from.toEpochDay();
        long toValue = to.toEpochDay();
        return ((targetValue >= fromValue) && (targetValue <= toValue));
    }

    /**
     * 対象日時が本日か確認します。
     *
     * @param stamp 対象日時
     * @return 本日の場合 true を返します
     */
    public static boolean isToday(Timestamp stamp) {
        if (stamp == null) {
            return false;
        }
        long target = zeroStamp(stamp).getTime();
        long today = getTodayTimestamp().getTime();
        return (target == today);
    }

    /**
     * 現在の年数文字列を取得します。
     *
     * @return 現在の年数文字列
     */
    public static String getYear() {
        return getYear(getToday());
    }

    /**
     * 現在の月数文字列を取得します。
     *
     * @return 現在の月数文字列
     */
    public static String getMonth() {
        return getMonth(addDate(getToday(), Calendar.MONTH, 1));
    }

    /**
     * 現在の日数文字列を取得します。
     *
     * @return 現在の日数文字列
     */
    public static String getDay() {
        return getDay(getToday());
    }

    /**
     * 現在の時数文字列を取得します。
     *
     * @return 現在の時数文字列
     */
    public static String getHour() {
        return getHour(LocalDate.ofEpochDay(Timestamp.valueOf(getLocalDateTime()).getTime()));
    }

    /**
     * 年齢を算出します。
     *
     * @param date 日付
     * @return 年齢
     */
    public static int getAge(LocalDate date) {
        String year = getYear(date);
        String month = getMonth(date);
        String day = getDay(date);
        return getAge(year, month, day);
    }

    /**
     * 年齢を算出します。
     *
     * @param yyyy 年
     * @param mm   月
     * @param dd   日
     * @return 年齢
     */
    public static int getAge(String yyyy, String mm, String dd) {
        int y = Integer.parseInt(yyyy);
        int m = Integer.parseInt(mm);
        int d = Integer.parseInt(dd);

        Calendar cal = Calendar.getInstance();
        int today_y = cal.get(Calendar.YEAR);
        int today_m = cal.get(Calendar.MONTH) + 1;
        int today_d = cal.get(Calendar.DATE);

        int age = today_y - y;
        // 誕生日前だったら１引く
        if (m > today_m || (m == today_m && d > today_d)) {
            age = age - 1;
        }

        return age;
    }

    public static Timestamp getSystemTimestamp() {
        return Timestamp.valueOf(getLocalDateTime());
    }

    public static LocalDate parse(Timestamp stamp) {
        return LocalDate.ofEpochDay(stamp.getTime());
    }

    /**
     * 現在日時(エポック秒)を取得します。
     *
     * @return 現在日時(エポック秒)
     */
    public static Instant getInstant() {
        //return OffsetDateTime.now(ZoneOffset.UTC);
        return Instant.now();
    }

    /**
     * 現在日時(エポック秒)を取得します。
     *
     * @return 現在日時(エポック秒)
     */
    public static long nowEpochMilli() {
        //return OffsetDateTime.now(ZoneOffset.UTC);
        return getInstant().toEpochMilli();
    }
}
