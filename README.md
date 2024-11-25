# Home Automation System using Bluetooth (Android App)

This project is a **Home Automation** system for controlling various smart devices using **Bluetooth** from an Android smartphone. The app is developed using **Android Studio** with a combination of **Java** for traditional Android Views and **Kotlin** for modern Android architecture and logic.

The app features a basic and intuitive **UI interface** to control multiple Bluetooth-enabled devices (like lights, fans, and other home appliances). Users can easily toggle devices, check their status, and control them remotely within a Bluetooth range.

---

## Features

- **Bluetooth Connectivity**: Connect and control devices over Bluetooth.
- **Multi-device Control**: Support for controlling multiple devices from a single interface.
- **Device Status Monitoring**: Display real-time status updates of connected devices.
- **Simple User Interface**: Clean and easy-to-use layout for seamless interaction.
- **Real-time Interaction**: Toggle devices on/off and monitor their statuses in real-time.
- **Support for Multiple Devices**: Manage more than one Bluetooth device from the app.

---

## Tech Stack

- **Programming Languages**:
  - **Java**: Used for traditional Android Views, Bluetooth functionality, and UI setup.
  - **Kotlin**: Used for the application logic, device control, and communication with Bluetooth devices.
  
- **Libraries/Frameworks**:
  - **Bluetooth API**: For Bluetooth communication.
  - **Android SDK**: The core Android development tools.
  - **Android Jetpack** (optional): For modern Android components like `LiveData`, `ViewModel`, etc.
  - **RecyclerView**: To display a list of connected devices dynamically.
  
- **Tools**:
  - **Android Studio**: IDE for Android development.
  
---

### How It Works
**Bluetooth Setup**
The app establishes a connection with Bluetooth-enabled devices using the BluetoothAdapter. Upon establishing the connection, users can interact with the device to toggle on/off, change settings, or get device status updates.
1. Bluetooth Adapter Initialization: The app uses the BluetoothAdapter to check whether Bluetooth is enabled on the device. If not, it prompts the user to enable Bluetooth.
2. Discover Devices: The app scans for available Bluetooth devices in the vicinity. Once devices are found, they are displayed in the UI for the user to select.
3. Connect to Devices: After selecting a device, the app establishes a Bluetooth connection, allowing users to send control commands (like turning on/off).
4. Send Commands: Control commands are sent to the selected Bluetooth device via BluetoothSockets. For instance, a signal to toggle a light might be a simple "1" (for ON) and "0" (for OFF).
5. Monitor Device Status: After sending the command, the app listens for a response from the device to monitor its status.

---

### Screenshots
![WhatsApp Image 2024-11-25 at 10 50 41_9650e558](https://github.com/user-attachments/assets/1171f338-2887-435e-a12f-8d19ce332f96)
![WhatsApp Image 2024-11-25 at 10 51 05_ffd4e8e5](https://github.com/user-attachments/assets/559b561c-d2f2-490e-b594-650502bd5413)
![WhatsApp Image 2024-11-25 at 10 51 21_f53b153c](https://github.com/user-attachments/assets/144be1a0-162a-42ab-8820-61c41154ae54)
![WhatsApp Image 2024-11-25 at 10 51 35_cb176cb7](https://github.com/user-attachments/assets/4e8f1e72-ae45-4383-b83d-4a519ddeb98a)

---
## Installation

### Prerequisites

- **Android Studio** (Latest version)
- **A Bluetooth-enabled Android device** (for testing)
- **Bluetooth-enabled smart devices** (to connect with the app, e.g., smart lights, fans, etc.)
  
### Steps to Run the Project

1. **Clone this repository**:
   ```bash
   git clone https://github.com/yourusername/home-automation-bluetooth.git
     ```
 2. **Open the project in Android Studio**:
      - Open Android Studio.
      - Click on Open and navigate to the cloned project directory.
      -  Open the project.

 3. **Install dependencies**:
    -   Ensure you have all necessary SDK components installed via SDK Manager in Android Studio.

 4. **Enable Bluetooth permissions**:
Add necessary permissions to the AndroidManifest.xml for Bluetooth access.
```xml
<uses-permission android:name="android.permission.BLUETOOTH"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
```
 5. **Run the App**:
    - Select your Android device or emulator.
    - Click on Run (green play button) in Android Studio to launch the app on your device.
