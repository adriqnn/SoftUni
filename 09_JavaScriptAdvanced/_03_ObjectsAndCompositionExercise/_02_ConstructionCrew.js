function construction_crewV1(obj){
    if(obj.dizziness === true){
        obj.levelOfHydrated += 0.1 * obj.weight * obj.experience;
        obj.dizziness = false;
    }

    return obj;
}

function construction_crewV2(obj){
    if(obj.dizziness){
        let result = 0.1 * obj.weight * obj.experience;
        obj.levelOfHydrated += result;
        obj.dizziness = false;
    }

    return obj;
}
