# DOM Introduction - Lecture

- Browser API -> Browser Object Model(BOM); browser exposes objects like window, screen, navigaton, history, location, document & other;
- Global Context in the Browser -> window;
- DOM(Document Object Model) -> represents the page as nodes and objects(dom tree)(dom hierarchy); defines properties(values), methods(actions), events & other;
- JavaScript & DOM API -> check the contents and structure of elements on page, change properties and style, read user input and react to events, create and remove elements and other;
- HTML Elements -> attributes and properties; dom manipulations include innerHTML, textContent, value, style & other; children are replaced or returned depending on the action;
- Targeting DOM Elements -> by id(getElementById), by class name(getElementByClassName), by tag name(getElementsByTagName), css selector(querySelector)('input[name='login']') and other;
- NodeList vs. HTMLCollection -> collections of DOM nodes; htmlcollection is live and nodelist is either live or static; both have iteration methods; html collection contains only element nodes;
- NodeList vs. HTMLCollection -> both are not arrays but can be iterated and indexed or turned to array with Array.from() or [...spread];
- Using the DOM API -> js scripts can be loaded from external sources, global scope function, can have multiple script files and load order is important;
