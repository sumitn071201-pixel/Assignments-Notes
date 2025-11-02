import React, { useState, useCallback } from 'react';

const generateRandomPassword = (length) => {
    const lower = 'abcdefghijklmnopqrstuvwxyz';
    const upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    const numbers = '0123456789';
    const symbols = '!@#$%^&*()_+-=[]{}|;:,.<>?';
    const allChars = lower + upper + numbers + symbols;

    if (length < 4 || length > 128) {
        return "Length must be between 4 and 128.";
    }

    let password = '';
    
    password += lower.charAt(Math.floor(Math.random() * lower.length));
    password += upper.charAt(Math.floor(Math.random() * upper.length));
    password += numbers.charAt(Math.floor(Math.random() * numbers.length));
    password += symbols.charAt(Math.floor(Math.random() * symbols.length));
    
    const remainingLength = length - 4;

    const randomBytes = new Uint32Array(remainingLength);
    window.crypto.getRandomValues(randomBytes);

    for (let i = 0; i < remainingLength; i++) {
        const randomIndex = randomBytes[i] % allChars.length;
        password += allChars[randomIndex];
    }
    
    const passwordArray = password.split('');
    
    for (let i = passwordArray.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [passwordArray[i], passwordArray[j]] = [passwordArray[j], passwordArray[i]];
    }

    return passwordArray.join('');
};

// -------------------------------------------------------------

const PasswordGenerator = () => {
    const [password, setPassword] = useState('');
    const [length, setLength] = useState(12);

    const generatePassword = useCallback(() => {
        const newPassword = generateRandomPassword(length);
        setPassword(newPassword);
    }, [length]);

    React.useEffect(() => {
        generatePassword();
    }, [generatePassword]);

    return (
        <div style={{ padding: '20px', maxWidth: '400px', margin: '50px auto', border: '1px solid #ccc', borderRadius: '8px', boxShadow: '2px 2px 10px rgba(0,0,0,0.1)' }}>
            <h2>🔐 Random Password Generator</h2>

            <div style={{ marginBottom: '20px' }}>
                <label>
                    Password Length: <strong>{length}</strong>
                </label>
                <input
                    type="range"
                    min="4"
                    max="32"
                    value={length}
                    onChange={(e) => setLength(Number(e.target.value))}
                    style={{ width: '100%', marginTop: '5px' }}
                />
            </div>

            <div style={{ marginBottom: '20px', padding: '10px', border: '2px dashed #007bff', backgroundColor: '#f9f9ff', borderRadius: '4px' }}>
                <p style={{ margin: 0, fontWeight: 'bold', wordBreak: 'break-all' }}>
                    {password}
                </p>
            </div>

            <button 
                onClick={generatePassword} 
                style={{ padding: '10px 20px', backgroundColor: '#28a745', color: 'white', border: 'none', borderRadius: '4px', cursor: 'pointer' }}
            >
                Generate New Password
            </button>
        </div>
    );
};

export default PasswordGenerator;