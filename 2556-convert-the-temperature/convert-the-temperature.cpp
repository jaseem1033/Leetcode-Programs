class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        double k=celsius + 273.15,f=celsius * 1.80 + 32.00;
        vector<double> a;
        a.push_back(k);
        a.push_back(f);
        return a;

    }
};