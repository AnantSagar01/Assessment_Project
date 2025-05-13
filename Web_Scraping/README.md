# Web Scraping Project

## Overview
This project is a web scraping application designed to extract useful data from https://www.airbnb.co.in/ websites from hotels 🏩 name, price and rating in bangalore using Python n and BeautifulSoup. The scraped data can be used for various purposes, such as data analysis, automation, and insights generation.

## Features
- Extracts data from specified web pages
- Parses and organizes the extracted data
- Saves the data in a structured format (CSV/JSON)
- Handles exceptions and errors gracefully
- Supports dynamic and static web pages

## Technologies Used
- **Python**: Core programming language
- **BeautifulSoup**: Parsing HTML and extracting data
- **Requests**: Sending HTTP requests
- **Pandas**: Data processing and saving
- **CSV/JSON**: Data storage formats

## Installation
To set up and run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/AnantSagar01/Assessment_Project.git
   cd Assessment_Project/Web_Scraping
   ```
2. Create a virtual environment (optional but recommended):
   ```bash
   python -m venv venv
   source venv/bin/activate  # On Windows, use `venv\Scripts\activate`
   ```
3. Install dependencies:
   ```bash
   pip install -r requirements.txt
   ```


## Example
Here is an example of how the output data might look:
```
[{
    Name                  	Prices                           Review
0	Farm stay in Bengaluru	₹21,298 night₹21,298 per night	New place to stayNew
1	Villa in Bengaluru	   ₹2,579 night₹2,579 per night	   5.0 out of 5 average rating, 14 reviews5.0 (14)
}]
```

## Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, reach out via email at [anantsagar0000@gmail.com](mailto:anantsagar0000@gmail.com).
