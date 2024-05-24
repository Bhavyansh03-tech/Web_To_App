
# Web to App Converter

Welcome to the Web to App Converter project! This repository contains a Kotlin Android application built using Jetpack Compose that allows users to convert any website into a standalone mobile application.




## Features

- Simple and Clean UI: Designed using Jetpack Compose for a modern and intuitive user interface.
- Web to App Conversion: Convert any website into a mobile app by simply providing the URL.
- Responsive Design: Ensures that the converted app works seamlessly on various screen sizes.


## Getting Started

### Prerequisites
- Android Studio installed on your computer.
- An Android device or emulator to run the app.
### Installation

1.> Clone the repository:

```bash
  git clone https://github.com/Bhavyansh03-tech/Web_To_App.git
```
2.> Open the project in Android Studio.

3.> Build and run the app on your device or emulator.
## Usage

1.> Launch the app on your device or emulator.\
2.> Enter the URL of the website you want to convert into an app.\
3.> Press the "Convert" button to view the website as a mobile application.
## Screenshots

<img src="https://github.com/Bhavyansh03-tech/Web_To_App/assets/96388594/ddc5f32a-c22e-460b-8c5c-4d7aa25cabff" alt="WebToApp" width="200"/>


## Code Snippet

Here is the code snippet that handles the web-to-app conversion:

```bash
  AndroidView(factory = { context ->
        return@AndroidView WebView(context).apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }
    },
        update = {
            it.loadUrl("https://www.pixabay.com")
        }
    )
```


## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

1.> Fork the Project.\
2.> Create your Feature Branch `git checkout -b feature/AmazingFeature`.\
3.> Commit your Changes `git commit -m 'Add some AmazingFeature'`.\
4.> Push to the Branch `git push origin feature/AmazingFeature`.\
5.> Open a Pull Request

## Acknowledgements

- Inspiration from various Android development tutorials and documentation.
## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech).
