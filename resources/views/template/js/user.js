$('document').ready(function () {
    $(".button-collapse").sideNav();
    var sideNavScrollbar = document.querySelector('.custom-scrollbar');
    var ps = new PerfectScrollbar(sideNavScrollbar);
});

$('.datepicker').pickadate({
    weekdaysShort: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
    showMonthsShort: true
});

$(document).ready(function () {
    $('.mdb-select').materialSelect();
});
