-- Create the database if it doesn't exist
CREATE DATABASE IF NOT EXISTS student_details;

-- Use the student_details database
USE student_details;

-- Create the student table
CREATE TABLE IF NOT EXISTS student (
                                       student_id INT AUTO_INCREMENT PRIMARY KEY,
                                       first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    contact_number VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    start_date DATE NOT NULL
    );

-- Insert dummy data into the student table
INSERT INTO student (first_name, last_name, contact_number, email, start_date) VALUES
                                                                                   ('John', 'Doe', '123-456-7890', 'john.doe@example.com', '2023-01-01'),
                                                                                   ('Jane', 'Smith', '098-765-4321', 'jane.smith@example.com', '2023-02-01'),
                                                                                   ('Alice', 'Johnson', '111-222-3333', 'alice.johnson@example.com', '2023-03-01'),
                                                                                   ('Bob', 'Brown', '444-555-6666', 'bob.brown@example.com', '2023-04-01');
