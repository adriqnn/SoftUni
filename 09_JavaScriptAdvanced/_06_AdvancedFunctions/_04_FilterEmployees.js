function filter_employeesV1(list, filter){
    const parsed = JSON.parse(list);
    const [criteria, value] = filter.split("-");

    return parsed.filter(e => e[criteria] === value).map((e, i) => `${i}. ${e.first_name} ${e.last_name} - ${e.email}`).join("\n");
}
