import { useState, useEffect } from "react";


function LoadAssets(){
    const [assets, setAssets] = useState([]);
    const [error, setError] = useState(null)
    const [cargando, setCargando] = useState(true);

    useEffect(() => {
        async function load() {
            try{
            const response = await fetch("http://localhost:8080/api/assets");
        
            if(!response.ok){
                throw new Error("Server error: " + response.status);
            }

            const data = await response.json();

            setAssets(data);

            } catch (err) {
                setError(err.message);
            } finally {
                setCargando(false);
            }
        }
        load();
    }, []);
    if(error){
        return (
            <>
                <p>Something went wrong, couldn't load assets. {error}</p>
                <p>If this issue persists, contact an administrator</p>
            </>
        )
    }
    return (
        <ul>
            {assets.map((a) => (
                <li key={a.assetId}>
                    <p><strong>Asset {a.assetId}</strong> | {a.assetName}</p>
                    <p><strong>Category</strong> | {a.assetCategory}</p>
                    <p><strong>Description</strong> | {a.assetDetail}</p>
                </li>
            ))}
        </ul>
        
    )
};

export default LoadAssets;