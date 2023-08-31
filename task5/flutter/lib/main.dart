import "package:flutter/material.dart";
import 'package:flutter/services.dart';

void main() {
  runApp(taskApp()); //MaterialApp
}

MaterialApp taskApp() {
  return MaterialApp(
    home: Scaffold(
      appBar: AppBar(
        title: const Text("App"),
        actions: <Widget>[
          IconButton(
            icon: const Icon(Icons.comment),
            onPressed: () {},
          ),
          IconButton(
            icon: const Icon(Icons.settings),
            onPressed: () {},
          ),
        ],
        backgroundColor: Colors.blue[400],
        elevation: 50.0,
        leading: IconButton(
          icon: const Icon(Icons.menu),
          onPressed: () {},
        ),
      ), //AppBar
      body: const Center(
        child: Text(
          "Hello,Flutter",
          style: TextStyle(fontSize: 80),
        ), //Text
      ), //Center
    ), //Scaffold
    debugShowCheckedModeBanner: false,
  );
}
