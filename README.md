# Smart Home System

A Java console program modeling a simple smart home system, demonstrating **Inheritance**, **Aggregation**, and **Dependency** between classes.

## How It Works

Creates smart devices (light, thermostat, security cameras), organizes them into rooms, and uses `SmartApp` to control them — turning devices on/off, adjusting settings, and checking status.

## Files

| File | Description |
|------|-------------|
| `Main.java` | Entry point — creates devices/rooms and demonstrates relationships |
| `Device.java` | Abstract `Device` class + subclasses `Light`, `Thermostat`, `SecurityCamera` (Inheritance) |
| `Room.java` | Holds an array of devices (Aggregation) |
| `SmartApp.java` | Controls devices without owning them (Dependency) |

## How to Run

1. Keep all four `.java` files in the same folder
2. Compile: `javac Main.java Device.java Room.java SmartApp.java`
3. Run: `java Main`

## Author

Dapinderdeep Kaur
