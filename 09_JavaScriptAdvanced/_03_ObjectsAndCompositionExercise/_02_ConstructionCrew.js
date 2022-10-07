function hydrate(worker){
    if(worker.dizziness){
        let result = 0.1 * worker.weight * worker.experience;
        worker.levelOfHydrated = worker.levelOfHydrated + result;
        worker.dizziness = false;
    }
    return(worker);
}