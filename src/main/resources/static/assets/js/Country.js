$('document').ready(function(){
//        $('#editButton').on('click',function(event){
//        $('#editModal').modal();
//        });

            // /countries/findById?id=1
            $('#editButton').on('click',function(){
            event.preventDefault();
                 var href= $(this).attr('href');
                  $.get(href,function(country,status){
                        $('#country-id-edit').val(country.id);
                        $('#country-code-edit').val(country.code);
                        $('#country-description-edit').val(country.description);
                        $('#country-continent-edit').val(country.continent);
                        $('#country-nationality-edit').val(country.nationality);

                   });
            });

});