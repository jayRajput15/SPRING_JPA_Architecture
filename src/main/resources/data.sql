INSERT INTO patient
(name, gender, birth_date, email, blood_group_type)
VALUES
    ('Aarav Sharma', 'MALE', '1990-05-10', 'aarav.sharma@example.com', 'O_POSITIVE'),
    ('Diya Patel', 'FEMALE', '1995-08-20', 'diya.patel@example.com', 'A_POSITIVE'),
    ('Dishant Verma', 'MALE', '1988-03-15', 'dishant.verma@example.com', 'A_POSITIVE'),
    ('Neha Iyer', 'FEMALE', '1992-12-01', 'neha.iyer@example.com', 'AB_POSITIVE'),
    ('Kabir Singh', 'MALE', '1993-07-11', 'kabir.singh@example.com', 'O_POSITIVE');


INSERT INTO doctor
(name, specialization, email)
VALUES
    ('Dr. Rajesh Mehta', 'Cardiology', 'rajesh.mehta@example.com'),
    ('Dr. Priya Nair', 'Dermatology', 'priya.nair@example.com'),
    ('Dr. Arjun Kapoor', 'Orthopedics', 'arjun.kapoor@example.com'),
    ('Dr. Sneha Reddy', 'Pediatrics', 'sneha.reddy@example.com'),
    ('Dr. Vivek Sharma', 'Neurology', 'vivek.sharma@example.com');


INSERT INTO department (name, head_doctor_id)
VALUES
    ('Cardiology', 1),
    ('Dermatology', 2),
    ('Orthopedics', 3);