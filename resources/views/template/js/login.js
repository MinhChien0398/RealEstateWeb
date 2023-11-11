const container = document.getElementById('container');
const showSignUpButton = document.getElementById('showSignUp');
const showSignInButton = document.getElementById('showSignIn');
const showSignInLink = document.getElementById('showSignInForm');
const showForgotPasswordLink = document.getElementById('showForgotPassword');
const signUpForm = document.querySelector('.form-container.sign-up');
const signInForm = document.querySelector('.form-container.sign-in');
const forgotPasswordForm = document.querySelector('.form-container.forgot-password');

showSignUpButton.addEventListener('click', () => {
    container.classList.add("active");
    signInForm.style.display = 'none';
    forgotPasswordForm.style.display = 'none';
    signUpForm.style.display = 'block';
});

showSignInButton.addEventListener('click', () => {
    container.classList.remove("active");
    signUpForm.style.display = 'none';
    forgotPasswordForm.style.display = 'none';
    signInForm.style.display = 'block';
});

showForgotPasswordLink.addEventListener('click', (event) => {
    // event.preventDefault();
    container.classList.remove("active");
    signUpForm.style.display = 'none';
    signInForm.style.display = 'none';
    forgotPasswordForm.style.display = 'block';
});
showSignInLink.addEventListener('click', (event) => {
    // event.preventDefault();
    container.classList.remove("active");
    forgotPasswordForm.style.display = 'none';
    forgotPasswordForm.style.display = 'none';
    signInForm.style.display = 'block';
});

const emailSignIn = document.getElementById("email-signin").value;
const emailForgot = document.getElementById("email-forgot").value;
const password = document.getElementById("password-signin").value;

const errorMessageSigin = document.getElementById("error-message-signin");
const errorMessageSignup = document.getElementById("error-message-signup");
const errorMessageForgot = document.getElementById("error-message-forgot");

errorMessageSignup.textContent = "";

document.getElementById("login-button").addEventListener("click", function () {
    errorMessageSigin.textContent = "";
    if (!emailSignIn || !password) {
        errorMessageSigin.textContent = "Vui lòng điền đầy đủ thông tin.";
        setTimeout(function () {
            errorMessageSigin.textContent = "";
        }, 2000);
        return;
    }
});
document.getElementById("request-button").addEventListener("click", function () {
    errorMessageForgot.textContent = "";
    if (!emailForgot) {
        errorMessageForgot.textContent = "Vui lòng điền đầy đủ thông tin.";
        setTimeout(function () {
            errorMessageForgot.textContent = "";
        }, 2000);
        return;
    }
});


