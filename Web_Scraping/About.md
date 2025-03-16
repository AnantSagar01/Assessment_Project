Web Scraping Project

## Overview
This project is a web scraping application designed to extract useful data from https://www.airbnb.co.in/ websites from homes name and price in bangalore using Python n and BeautifulSoup. The scraped data can be used for various purposes, such as data analysis, automation, and insights generation.

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

## Usage
1. Update the `config.py` file with the target URL and scraping parameters.
2. Run the script:
   ```bash
   python scraper.py
   ```
3. The extracted data will be saved in the `output` folder.

## Example
Here is an example of how the output data might look:
```
[{
    "title": "Sample Article",
    "author": "John Doe",
    "date": "2025-03-17"
}]
```

## Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, reach out via email at [anantsagar0000@gmail.com](mailto:anantsagar0000@gmail.com).
