function breakfast_robotV1(){
    const recipes = {
        apple: {carbohydrate: 1, flavour: 2},
        lemonade: {carbohydrate: 10, flavour: 20},
        burger: {carbohydrate: 5, fat: 7, flavour: 3},
        eggs: {protein: 5, fat: 1, flavour: 1},
        turkey: {protein: 10, carbohydrate: 10, fat: 10, flavour: 10}
    };

    const stock = {
        protein: 0,
        carbohydrate: 0,
        fat: 0,
        flavour: 0
    };

    const commands = {
        restock,
        prepare,
        report
    };

    return manager;

    function manager(line){
        const [command, param, qty] = line.split(' ');

        return commands[command](param, qty);
    }

    function restock(type, qty){
        stock[type] += Number(qty);
        return 'Success';
    }

    function prepare(recipeAsString, qty){
        qty = Number(qty);
        const recipe = Object.entries(recipes[recipeAsString]);
        recipe.forEach(ingredient => ingredient[1] *= qty);

        for (const [ingredient, required] of recipe) {
            if(stock[ingredient] < required){
                return `Error: not enough ${ingredient} in stock`;
            }
        }

        recipe.forEach(([ingredient, required]) => stock[ingredient] -= required);

        return 'Success';
    }

    function report(){
        return `protein=${stock.protein} carbohydrate=${stock.carbohydrate} fat=${stock.fat} flavour=${stock.flavour}`;
    }
}

function breakfast_robotV2(){
    const recipes = {
        apple: {
            carbohydrate: 1,
            flavour: 2
        },
        lemonade: {
            carbohydrate: 10,
            flavour: 20
        },
        burger: {
            carbohydrate: 5,
            fat: 7,
            flavour: 3
        },
        eggs: {
            protein: 5,
            fat: 1,
            flavour: 1
        },
        turkey: {
            protein: 10,
            carbohydrate: 10,
            fat: 10,
            flavour: 10
        }
    };

    const stock = {
        protein: 0,
        carbohydrate: 0,
        fat: 0,
        flavour: 0
    };

    const commands = {
        restock,
        prepare,
        report
    };

    return manager;

    function manager(line){
        const [command, param, qty] = line.split(' ');
        return commands[command](param, qty);
    };

    function restock(type, qty){
        stock[type] += Number(qty);
        return 'Success';
    }

    function prepare(recipeAsString, qty){
        qty = Number(qty);
        const recipe = Object.entries(recipes[recipeAsString]);
        recipe.forEach(ingredient => ingredient[1] *= qty);

        for (const [ingredient, required] of recipe) {
            if(stock[ingredient] < required){
                return `Error: not enough ${ingredient} in stock`;
            }
        }

        recipe.forEach(([ingredient, required]) => stock[ingredient] -= required);

        return 'Success';
    }

    function report(){
        return `protein=${stock.protein} carbohydrate=${stock.carbohydrate} fat=${stock.fat} flavour=${stock.flavour}`;
    }
}

function breakfast_robotV3() {
    const ingredients = {
        protein: 0,
        carbohydrate: 0,
        fat: 0,
        flavour: 0
    };

    const recipes = {
        apple: parseRecipeData(0, 1, 0, 2),
        lemonade: parseRecipeData(0, 10, 0, 20),
        burger: parseRecipeData(0, 5, 7, 3),
        eggs: parseRecipeData(5, 0, 1, 1),
        turkey: parseRecipeData(10, 10, 10, 10)
    };

    function parseRecipeData(protein, carbohydrate, fat, flavour) {
        return {
            protein,
            carbohydrate,
            fat,
            flavour
        };
    }

    function restock(i, x) {
        ingredients[i] += x;
        return "Success";
    }

    function prepare(required, quantity) {
        const parsedRecipe = Object.entries(required).map(x => [x[0], x[1] * quantity]);

        for (let i = 0; i < parsedRecipe.length; i++) {
            const [name, amount] = parsedRecipe[i];
            if (ingredients[name] - amount < 0) {
                return `Error: not enough ${name} in stock`;
            }
        }

        parsedRecipe.forEach(([name, amount]) => (ingredients[name] -= amount));
        return "Success";
    }

    const report = () =>
        Object.entries(ingredients).map(([key, value]) => `${key}=${value}`).join(" ");

    const actions = {
        prepare: (r, q) => prepare(recipes[r], q),
        restock,
        report
    }

    return s => {
        const [command, a, b] = s.split(" ").map(x => (isNaN(x) ? x : Number(x)));

        return actions[command](a, b);
    }
}
