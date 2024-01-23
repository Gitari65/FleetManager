function updateModelSelect() {
    console.log("updateModelSelect function called");

    var carMakeSelect = document.getElementById("car-make");
    var selectedCarMakeId = carMakeSelect.value;
    var carModelInput = document.getElementById("car-model");
    var datalist = document.getElementById("model-list");

    // Fetch models for the selected car make from the server
    fetch('/carModels/ByMakeId/' + selectedCarMakeId)
        .then(response => response.json())
        .then(models => {
            console.log("models", models);

            // Clear existing options in datalist
            datalist.innerHTML = "";

            // Add new options based on the fetched models to the datalist
            models.forEach(model => {
                var option = document.createElement("option");
                option.value = model.name || 'Model Name Not Available';
                datalist.appendChild(option);
            });
        })
        .catch(error => console.error('Error fetching models:', error));
}


//toggle availability radio buttons
function toggleAvailability() {
    var availability = document.getElementById("car-availability");
    availability.value=availability.checked ? "available" : "unavailable";
    }
