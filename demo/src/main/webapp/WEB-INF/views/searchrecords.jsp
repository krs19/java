<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search records</title>
  <style>
        table, th, td {
            border: 1px solid black;
            padding: 1px;
        }
    </style>
    <!--  END STYLE -->

</head>
<body>
<form action="#">
    <label for="search_input">Search:</label> <input name="search"
                                                     id="search">
    </input>
    <div">
        <h2>Search Results</h2>
        <table>
            <thead>
            <tr>
                <th>patientID</th>
                <th>firstname</th>
                <th>dob</th>
                
            </tr>
            </thead>
            <tbody>
            <tr th:each="search : ${search}">
                <td th:text="${search.id}">Text ...</td>
                <td th:text="${search.name}">Text ...</td>
                <td th:text="${search.rarityLevel}">Text ...</td>
                <td th:text="${search.year}">Text...</td>
            </tr>
            </tbody>
        </table>
    </div>
</form>
</body>
</html>