$('document').ready(function(){
//        $('#editButton').on('click',function(event){
//        $('#editModal').modal();
//        });
console.log("hey in country.js")

            // /countries/findById?id=1
            $('table #editButton').on('click',function(event){
            event.preventDefault();
                 var href= $(this).attr('href');
                 console.log("clicked edit")
                  $.get(href,function(country,status){
                        $('#country-id-edit').val(country.id);
                        $('#country-code-edit').val(country.code);
                        $('#country-description-edit').val(country.description);
                        $('#country-continent-edit').val(country.continent);
                        $('#country-nationality-edit').val(country.nationality);


                   });
            });

});