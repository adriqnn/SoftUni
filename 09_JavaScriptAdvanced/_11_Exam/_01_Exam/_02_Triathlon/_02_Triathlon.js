class TriathlonV1{
    constructor(competitionName){
        this.competitionName = competitionName;
        this.participants = {};
        this.listOfFinalists = [];
        this.p = [];
    }

    addParticipant(participantName, participantGender){
        const participant = this.p.find(par => par.participantName === participantName);
        if(!participant){
            const participantAdd = {
                participantName: participantName,
                participantGender: participantGender
            }

            this.participants[participantName] = participantGender;
            this.p.push(participantAdd);

            return `A new participant has been added - ${participantName}`;
        }

        return `${participantName} has already been added to the list`;
    }

    completeness(participantName, condition){
        const participant = this.p.find(par => par.participantName === participantName);
        if(!participant){
            throw new Error(`${participantName} is not in the current list`);
        }

        if(Number(condition) < 30){
            throw new Error(`${participantName} is not well prepared and cannot finish any discipline`);
        }

        let disciplines = Math.floor(Number(condition) / 30);
        if(disciplines <= 2){
            return `${participantName} could only complete ${disciplines} of the disciplines`;

        }
        const participantIndex = this.p.findIndex(par => par.participantName === participantName);
        this.p.splice(participantIndex,1);
        this.listOfFinalists.push(participant);
        delete this.participants[participantName];

        return `Congratulations, ${participantName} finished the whole competition`;
    }

    rewarding(participantName){
        const participant = this.listOfFinalists.find(p => p.participantName === participantName);
        if(!participant){
            return `${participantName} is not in the current finalists list`;
        }

        return `${participantName} was rewarded with a trophy for his performance`;
    }

    showRecord(criteria){
        if(this.listOfFinalists.length === 0){
            return `There are no finalists in this competition`;
        }

        if(criteria === 'male'){
            let maleList = this.listOfFinalists.filter(p => p.participantGender = 'male');
            if(maleList.length === 0){
                return `There are no ${criteria}'s that finished the competition`;
            }

            const male = maleList[0];

            return `${male.participantName} is the first ${criteria} that finished the ${this.competitionName} triathlon`;
        }

        if(criteria === 'female'){
            let femaleList = this.listOfFinalists.filter(p => p.participantGender = 'female');
            if(femaleList.length === 0){
                return `There are no ${criteria}'s that finished the competition`;
            }

            const female = femaleList[0];

            return `${female.participantName} is the first ${criteria} that finished the ${this.competitionName} triathlon`;

        }

        const people = [];
        people.push(`List of all ${this.competitionName} finalists:`);
        people.push(this.listOfFinalists.sort((a,b) => a.participantName.localeCompare(b.participantName)).map(par => `${par.participantName}`).join('\n'));

        return people.join('\n');
    }
}
