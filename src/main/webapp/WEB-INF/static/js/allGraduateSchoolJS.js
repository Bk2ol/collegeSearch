

$('#graduateSchoolTable').DataTable({
  "scrollX": true,
  "columns": [
                { "data": "schoolName" },
                { "data": "majorName" },
                { "data": "degree" },
                { "data": "rank" },
                { "data": "test" },
                { "data": "languageTest" },
                { "data": "deadline" },
                { "data": "phone" },
                { "data": "email" },
                { "data": "admissionWebpage",
                  "render" : function(data, type, row, meta){
                    return '<button class = "btn btn-primary" data-toggle="tooltip" data-placement="top" >Click here to copy</button>'
                   }
                }
             ],
  "language": {
    "emptyTable":     "Please Search By The Option Above"
  }
});
  var query = new Object();
    $.ajax({
      type: "POST",
      url: "searchGraduateSchoolMajor",
      data: JSON.stringify(query),
      contentType :   'application/json',
      dataType: "json",
         success: function(result){
           var table=$('#graduateSchoolTable').DataTable();
           table.clear().draw();
           table.rows.add(result).draw();
           $.notify(
            {
              icon: 'glyphicon glyphicon-ok-circle',
              message: "Search success!"
            },{
              type: 'success',
              delay: 2000,
              template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
                        '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
                        '<span data-notify="icon"></span> ' +
                        '<span data-notify="title">{1}</span> ' +
                        '<span data-notify="message">{2}</span>' +
                        '<div class="progress" data-notify="progressbar">' +
                          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
                        '</div>' +
                        '<a href="{3}" target="{4}" data-notify="url"></a>' +
                      '</div>' 
          });
         }
    });





$('#graduateSchoolTable tbody').on( 'click', 'button', function () {
  var table = $('#graduateSchoolTable').DataTable();
    var data =  table.row( $(this).parents('tr') ).data();
    copyTextToClipboard(data.admissionWebpage);
} );


function copyTextToClipboard(text) {
  var textArea = document.createElement("textarea");

  textArea.style.position = 'fixed';
  textArea.style.top = 0;
  textArea.style.left = 0;
  textArea.style.width = '2em';
  textArea.style.height = '2em';

  textArea.style.padding = 0;

  textArea.style.border = 'none';
  textArea.style.outline = 'none';
  textArea.style.boxShadow = 'none';

  // Avoid flash of white box if rendered for any reason.
  textArea.style.background = 'transparent';


  textArea.value = text;

  document.body.appendChild(textArea);

  textArea.select();

  try {
    var successful = document.execCommand('copy');
    var msg = successful ? 'successful' : 'unsuccessful';
    $.notify(
            {
              icon: 'glyphicon glyphicon-ok',
              message: "Copy the Link: "+text,
              // url: 'goHTTP/'+text
            },{
              type: 'success',
              delay: 2000,
              template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
                        '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
                        '<span data-notify="icon"></span> ' +
                        '<span data-notify="title">{1}</span> ' +
                        '<span data-notify="message">{2}</span>' +
                        '<div class="progress" data-notify="progressbar">' +
                          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
                        '</div>' +
                        '<a href="{3}" target="{4}" data-notify="url"></a>' +
                      '</div>' 
          });
  } catch (err) {
    console.log('Oops, unable to copy');
  }

  document.body.removeChild(textArea);
}