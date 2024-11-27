for managing articles and performing full-text search operations 
It allows CRUD operations on articles and includes a search endpoint to retrieve articles by text content.

Features
Create Articles: Add new articles to the database.
Retrieve Articles: Fetch all articles or a specific article by its ID.
Update Articles: Modify an existing article's details.
Delete Articles: Remove an article from the database.
Search Articles: Perform a full-text search on articles.

Setup Instructions
Prerequisites

Java 17 or higher
Maven
H2 Database (or any other database configured in application.properties


Create a New Article

Method: POST
URL: http://localhost:8080/api/articles
Body: Select "raw" and "JSON (application/json)," then enter the JSON data for a new article.
For example:

{
  "title": "Sample Article",
  "author": "John Doe",
  "content": "This is a sample article content.",
  "publicationDate": "2023-12-25",
  "category": "Sample Category",
  "keywords": "sample, article"
}
