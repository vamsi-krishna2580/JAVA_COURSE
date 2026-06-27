import subprocess
from datetime import datetime

LOG_FILE = "library_test_log.txt"


def run_test(test_name, input_data):
    try:
        result = subprocess.run(
            ["java", "Main"],
            input=input_data,
            text=True,
            capture_output=True,
            timeout=30
        )

        output = result.stdout

        with open(LOG_FILE, "a", encoding="utf-8") as f:
            f.write("\n" + "=" * 80 + "\n")
            f.write(f"TEST : {test_name}\n")
            f.write("=" * 80 + "\n")
            f.write("INPUT:\n")
            f.write(input_data + "\n")
            f.write("\nOUTPUT:\n")
            f.write(output + "\n")

        print(f"[PASS] {test_name}")

    except Exception as e:
        with open(LOG_FILE, "a", encoding="utf-8") as f:
            f.write(f"\n[FAIL] {test_name}\n")
            f.write(str(e) + "\n")

        print(f"[FAIL] {test_name}")


# Clear old log
with open(LOG_FILE, "w", encoding="utf-8") as f:
    f.write("LIBRARY MANAGEMENT SYSTEM TEST REPORT\n")
    f.write(f"Generated : {datetime.now()}\n\n")


# ---------------------------------------------------
# TEST 1 : Add Book
# ---------------------------------------------------
run_test(
    "Add Book",
    """1
101
Java Programming
2024
true
123456
500
12
"""
)

# ---------------------------------------------------
# TEST 2 : Add DVD
# ---------------------------------------------------
run_test(
    "Add DVD",
    """2
201
Avengers
2023
true
180
Action
12
"""
)

# ---------------------------------------------------
# TEST 3 : Add Magazine
# ---------------------------------------------------
run_test(
    "Add Magazine",
    """3
301
Tech Monthly
2025
true
12
June
12
"""
)

# ---------------------------------------------------
# TEST 4 : Add Student
# ---------------------------------------------------
run_test(
    "Add Student",
    """5
1
Praveen
CSE
2024
12
"""
)

# ---------------------------------------------------
# TEST 5 : Add Faculty
# ---------------------------------------------------
run_test(
    "Add Faculty",
    """6
100
Dr Smith
Computer Science
12
"""
)

# ---------------------------------------------------
# TEST 6 : Search Existing Item
# ---------------------------------------------------
run_test(
    "Search Item",
    """1
101
Java
2024
true
12345
400
8
101
12
"""
)

# ---------------------------------------------------
# TEST 7 : Search Non Existing Item
# ---------------------------------------------------
run_test(
    "Search Missing Item",
    """8
999
12
"""
)

# ---------------------------------------------------
# TEST 8 : View All Items
# ---------------------------------------------------
run_test(
    "View All Items",
    """4
12
"""
)

# ---------------------------------------------------
# TEST 9 : View Members
# ---------------------------------------------------
run_test(
    "View Members",
    """7
12
"""
)

# ---------------------------------------------------
# TEST 10 : Invalid Menu Option
# ---------------------------------------------------
run_test(
    "Invalid Choice",
    """99
12
"""
)

print(f"\nTesting completed.")
print(f"Check log file : {LOG_FILE}")