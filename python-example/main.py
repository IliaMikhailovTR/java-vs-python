from Example import Example
from ExampleCopy import ExampleCopy


def run_method_1(example):
    example.method_1()


if __name__ == '__main__':
    print('I am running')
    example = Example()
    run_method_1(example)
