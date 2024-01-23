


//function for car details save
function saveCarDetails() {
var form=document.getElementById('car-details-form');
var formData = new FormData(form);
  // Set proper enctype for the form
    formData.enctype = 'multipart/form-data';

//ajax call for save car details
$.ajax({
    url: '/car/add',
    type: 'POST',
    data: formData,
    processData: false,
    contentType: false,
    success: function(data){
        if(data.status == "success"){
            console.log("success");
            $('#loadingModal').modal('hide');
            //show success modal
            $('#successModal').modal('show');
        }else{
            alert("Error in saving car details");
        }
    },
    error: function () {
        console.log("error");
        $('#loadingModal').modal('hide');
        //show error modal
        $('#errorModal').modal('show');
    }
});
}
function validateFileSize() {
    var fileInput = document.getElementById('file');
    var fileSizeError = document.getElementById('fileSizeError');
    var maxSize = 10 * 1024 * 1024; // 10MB

    if (fileInput.files.length > 0) {
        var fileSize = fileInput.files[0].size;

        if (fileSize > maxSize) {
            fileSizeError.innerHTML = 'File size exceeds the maximum allowed (10MB).';
            // Clear the file input to prevent submission
            fileInput.value = '';
        } else {
            fileSizeError.innerHTML = '';
        }
    }
}
