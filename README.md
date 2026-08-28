# Spiral Galaxy

## 🌌 Spiral Galaxy

A real-time procedural galaxy visualisation built with Java, Java Swing, and Java2D.

The project generates thousands of stars and animates them around a central point to create the appearance of a rotating spiral galaxy. The galaxy can be interactively adjusted while the simulation is running.

![SpeedDemo](Assets/SpiralGalaxySpeedDemo.gif)

✨ Features
 - 🌟 5,000+ procedurally generated stars
 - 🌀 Real-time galaxy rotation
 - 🎨 Multiple star colours for visual variation
 - 🎮 Interactive keyboard controls
 - 📐 Adjustable galaxy perspective
 - ⚡ Real-time Java2D rendering
 - 🖥️ Lightweight — no external dependencies

Rotation Speed: The rotation speed of the galaxy can be adjusted while the application is running.

Galaxy Perspective: The arrow keys allow the apparent width and height of the galaxy to be adjusted.

![SizeDemo](Assets/SpiralGalaxySizeDemo.gif)

## 🎮 Controls
Key	Action
 - ↑	Increase galaxy height
 - ↓	Decrease galaxy height
 - ←	Decrease galaxy width
 - →	Increase galaxy width
 - Slidier	Adjust rotation speed

## 🛠️ Built With
 - Java
 - Java Swing
 - Java2D
 - Polar-coordinate mathematics
 - Procedural generation

## 🧮 How It Works

The galaxy is represented as a collection of procedurally generated points.

Each star is initially assigned a random:
 - Radius
 - Angle
 - Colour

The stars are stored using polar coordinates:
(r, θ)


During each update, the angular component of each star is modified, causing the stars to rotate around the galaxy's centre.
The polar coordinates are then converted into Cartesian coordinates for rendering:

 - x = r × cos(θ)
 - y = r × sin(θ)


The resulting positions are transformed to create the appearance of a tilted galaxy before being rendered using Java2D.
This approach keeps the simulation lightweight while producing a visually interesting real-time animation.

## Main Components
 - Spiral	Manages the galaxy and its stars
 - SpiralPoint	Represents an individual star
 - Vector2D    Handles vector and coordinate operations
 - MainPanel	Renders the galaxy
 - MainDisplay	Creates and manages the application window
 - UserInputListener	Handles keyboard interaction
 - Main    Application entry point and update loop

## 🚀 Getting Started
Requirements:
 - Java Development Kit (JDK)
 - Windows, if using the included run.bat script

You can verify that Java is installed with:

    java -version
    javac -version

Run

Clone the repository:

    git clone https://github.com/BinaryOpus/SpiralGalaxy.git


Navigate into the project:

    cd SpiralGalaxy

On Windows, run:

    run.bat

Alternatively, compile the source files manually:

    cd src
    javac Main/*.java View/*.java Assets/*.java Utilities/*.java Controller/*.java
    java Main/Main

🎯 Project Goals

This project was created as an exploration of:

 - Procedural generation
 - 2D computer graphics
 - Polar and Cartesian coordinates
 - Real-time animation
 - Java2D rendering
 - Interactive visualisation

The goal was to create a visually appealing galaxy effect using a relatively small amount of code and without relying on external graphics libraries.

📊 Technical Notes

The current implementation focuses on visualisation rather than astrophysical accuracy. The galaxy is a procedural animation designed to resemble a rotating spiral galaxy rather than a physically accurate simulation of gravitational interactions. This makes the project lightweight and suitable for experimenting with procedural graphics and real-time rendering.

📜 License

This project is licensed under the terms of the MIT License.
