<%-- 
    Document   : CategorizedPhones
    Created on : Aug 22, 2021, 1:13:18 PM
    Author     : ahmed.gamal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Demo which uses Bootstrap 4</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.4/themes/redmond/jquery-ui.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.5/css/ui.jqgrid.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.5/jquery.jqgrid.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
        <script>
//            $.jgrid = $.jgrid || {};
//            $.jgrid.no_legacy_api = true;
//
            //<![CDATA[
            var list = '${list}';
            $(function () {
                "use strict";
                $("#grid").jqGrid({
                    colModel: [
                        {name: "country", label: "Country",align: "center", width: 200},
                        {name: "state", label: "State", width: 200, align: "center",
                            searchoptions: {sopt: ["eq"]}},
                        {name: "countryCode", label: "Country Code",align: "center", width: 200},
                        {name: "phoneNumber", label: "Phone Number",align: "center", width: 200}
                    ],
                    data: JSON.parse(list),
                    iconSet: "fontAwesome",
                    idPrefix: "g5_",
                    rownumbers: true,
                    sortname: "invdate",
                    sortorder: "desc",
                    threeStateSort: true,
                    sortIconsBeforeText: true,
                    headertitles: true,
                    toppager: true,
                    pager: true,
                    rowNum: 12,
                    viewrecords: true,
                    searching: {
                        defaultSearch: "cn"
                    },
                    caption: "The grid, which Categorized The Customers \n\
        By Country, State, Country Code And Phone Numbers "
                }).jqGrid("filterToolbar");
            });
            //]]>

        </script>
        <style>
            .ui-search-input > input::-ms-clear {
                display: none;
            }
        </style>
    </head>
    <body>
        <br>
                <br>

        <h2 style="text-align: center; color: cadetblue; font-weight: bold">Phone Categorization Page</h2>
        <div style="margin-left: 23%; margin-top: 3%;">
            <table id="grid"></table>
        </div>
    </body>
</html>