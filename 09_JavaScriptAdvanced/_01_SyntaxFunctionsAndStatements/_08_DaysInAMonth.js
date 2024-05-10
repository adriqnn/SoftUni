function days_in_a_monthV1(month, year) {
    let date = new Date(year, month);
    date.setDate(1 - 1);

    return date.getDate();
}
