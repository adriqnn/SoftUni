function foreign_languageV1(country){
    switch (country){
        case("USA"):
        case("England"):
            console.log("English");
            break;
        case("Spain"):
        case("Argentina"):
        case("Mexico"):
            console.log("Spanish");
            break;
        default:
            console.log("unknown");
    }
}

const foreign_languageV2 = function(country){
    switch (country){
        case("USA"):
        case("England"):
            console.log("English");
            break;
        case("Spain"):
        case("Argentina"):
        case("Mexico"):
            console.log("Spanish");
            break;
        default:
            console.log("unknown");
    }
}

const foreign_languageV3 = (country) => {
    switch (country){
    case("USA"):
    case("England"):
        console.log("English");
        break;
    case("Spain"):
    case("Argentina"):
    case("Mexico"):
        console.log("Spanish");
        break;
    default:
        console.log("unknown");
    }
}