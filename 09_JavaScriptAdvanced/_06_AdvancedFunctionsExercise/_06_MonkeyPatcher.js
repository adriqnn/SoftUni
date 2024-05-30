function monkey_patcherV1(command){
    const actions = {
        upvote: (x) => {x.upvotes += 1},
        downvote: (x) => {x.downvotes += 1},
        score: (x) => getScore(x)
    }

    function shouldBeObfuscated(votes){
        return votes > 50;
    }

    function getObfNumber(u, d){
        return Math.ceil(0.25 * Math.max(u, d));
    }

    function calculateRating(u, d){
        if(u + d < 10){
            return 'new';
        }

        if(u > (u + d) * 0.66){
            return 'hot';
        }

        if(u - d >= 0 && (u > 100 || d > 100)){
            return 'controversial';
        }

        if(u - d < 0){
            return 'unpopular';
        }

        return 'new';
    }

    function getScore({upvotes, downvotes}){
        const obfNumber = shouldBeObfuscated(upvotes + downvotes) ? getObfNumber(upvotes, downvotes) : 0;
        const [rUpVotes, rDownVotes] = [upvotes + obfNumber, downvotes + obfNumber];
        const balance = rUpVotes - rDownVotes;

        return [rUpVotes, rDownVotes, balance, calculateRating(upvotes, downvotes)];
    }

    return actions[command](this);
}
