# DOM Manipulations and Events - Lecture

* DOM Manipulations -> used to create, append, remove or replace html elements;
* Node Cloning -> cloneNode(true)(creates a copy depending on true);
* DOM Manipulating and Node Hierarchy -> appendChild(adds new child), prepend(adds element as a first child) and other;
* The DOM Event -> calls associated function, passes the event object as reference, contains information about the event(element, coordinates, type & other);
* Types of Events -> mouse, touch, DOM/UI, keyboard, focus, form & other;
* Event Handling -> with event handler that provide a callback function; 3 types to register an event(html attribute, DOM element properties and DOM event handler);
* Event Listener -> addEventListener(event, function) and removeEventListener(event, function);
* Event Listener and this -> this refers to the event source element; attention to object methods;
* Event Propagation -> the event uses bubbling to go up the tree chain; easier to add event listener on ancestor instead of adding the same listener on multiple elements;
* Controlling Propagation and Bahaviour -> stopPropagation, preventDefault & other;
